# Tests Auto Generation

Overview of tests auto generation in Java ecosystem.

The purpose of this project is to bootstrap and experiment a couple of solutions to generate Unit Test Suites automatically.

## Evosuite

http://www.evosuite.org/

### Pré-requis

- JDK 1.8 (ne fonctionne pas avec le JDK 11 en l'occurrence). Sinon, erreur `java.lang.RuntimeException: Did not manage to automatically find tools.jar. Use -Dtools_jar_location=<path> property
`

### Command line

For generating test suites for all classes :

`./gradlew evosuite`

For generating test suites for specific class :

`./gradlew evosuite -Ptestclass=jbhembise.testauto.example1.Calculator`

For executing all generated test suites :

`./gradlew evosuiteTest`

For displaying evosuite command line help :

`./gradlew evosuiteHelp`

### Résultats

- Les tests générés dépendent d'un Runner "Evosuite"
- tests compatibles JUnit 4
- Une classe mère de Scaffolding pour chaque classe de test
- Nommage basique des tests en "test0", "test01", "test02", ...
- Tests assez lisibles (import static sur assertions JUnit)

### Ressources
- https://vimeo.com/191006782

## JWalk

http://staffwww.dcs.shef.ac.uk/people/A.Simons/jwalk/

### Prérequis

- Demander une licence JWalk (JWalkLicense.txt) depuis le site et la déposer à la racine de ce projet

### Command line

For launching JWalk tool with UI :

`./gradlew jwalkUI`

For generating test suites for specific class :

`./gradlew jwalk -Ptestclass=jbhembise.testauto.example1.Calculator`

### Résultats

- Pas de tests JUnit
- UI très vieillote (Java Swing) ou version en ligne de commande
- Essaye de trouver toutes les combinaisons de méthode pour une classe => pas adapté pour de simples POJOs Java
- Construit un Oracle avec le feedback de l'utilisateur. L'Oracle devine tout seul certains cas.
- A chaque changement du code source, on peut relancer l'exploration.
- Ne recherche pas les meilleures input pour maximiser le coverage (InputGenerator à fournir, ceux par défaut sont simplistes)

## Randoop

https://randoop.github.io/randoop/

### Command line

For generating test suites for specific class :

`./gradlew randoop -Ptestclass=jbhembise.testauto.example1.Calculator`

For executing all generated test suites :

`./gradlew randoopTest`

### Résultats

- Les tests générés ne dépendent que de JUnit, et pas d'un Runner spécifique Randoop
- Beaucoup de tests générés, pour les même cas
- tests compatibles JUnit 4
- Nommage basique des tests en "test0001", "test0002", ...
- les séquences générées sont totalement aléatoires et parfois inutiles : 3 fois de suite l'appel à la méthode `Calculator.clear()`
- beaucoup de casting de variables primitives (ex: `(int) (short) 1`)
- Ne comprends pas l'utilité de `org.junit.Assert.assertNotNull(wildcardClass);`
- Utilise les fully qualified name des classes. Ex: `jbhembise.testauto.example1.Calculator`

## DSpot

### Pré-requis
- Gradle < 5 pour utiliser le GradleBuilder, sinon erreur sur le "leftShift()"
- Maven
- JDK 1.8 (ne fonctionne pas avec le JDK 11 en l'occurrence)
- Au moins une dépendance en "compile" dans `build.gradle` (sinon, on a une NullPointerException)

### Command line

For generating test suites for specific class :

`./gradlew dspot -Ptestclass=jbhembise.testauto.example1.Calculator`

For executing all generated test suites :

`./gradlew dspotTest`

### Résultats

- Difficultés du setup Gradle (nécessité d'avoir un bloc `buildscript` par ex)
- Des reliquats de Maven en dur dans plusieurs classes dont `DSpotCompiler`

## Comparatif

### Exemple 1 - Calculette

Usecase simple qui implique une séquence d'opérations avec conservation du résultat à chaque étape.

**evosuite**

10 tests générés, dont la multiplication par 0, la division par 0 (exception), le reset à 0, pour un taux de couverture de 100%.

**randoop**

1894 tests générés, dont 64 tests d'erreur uniquement à cause de la division par 0, pour un taux de couverture de 100%.

**jwalk**

Avec une profondeur de 4 cycles, l'outil génère 1555 tests, mais n'en exécute réellement que 151. Il trouve de lui-même (à tord ou à raison) 1404 tests redondants. 
L'utilisateur n'a été sollicité que 16 fois.
Si je modifie ma classe, sans supprimer au passage mon oracle, je n'ai que le minimum de vérifications à faire. Mon oracle est complété mais l'ancienne version de la séquence n'est pas supprimée.
Coverage non applicable.

**dspot**

7 tests générés (en prenant pour base le test existant), dont la division par 0 (exception), le reset à 0, pour un taux de couverture de 100%.
Certains tests sont redondants.
Je ne comprends pas pourquoi le test fait une première assertion post-constructeur, puis une autre à la fin de la séquence.

### Exemple 2 - Calcul promotion par paliers

Usecase pour éprouver la génération d'inputs dans les tests auto fabriqués.

**evosuite**

5 tests générés, pour toutes les valeurs de franchissement de paliers et une valeur aléatoire en dessous du premier palier et au dessus du dernier palier, avec un taux de couverture de 100%.

**randoop**

21 tests générés pour un taux de couverture de 71% (2 branches non atteintes).
Les inputs envoyées sont : -1, 0, 35 ("#" converti en entier), 97 ("a" converti en entier), 32 (espace converti en entier), 4, 5, 10, 100.
Voir classe `randoop.generation.SeedSequences` pour comprendre d'où viennent ces valeurs. Seule la valeur 5 n'en provient pas : elle est l'une des valeurs de retour de la méthode.
Un test bizarre qui vérifie que "getClass()" renvoie une valeur non null.

**jwalk**

0 test généré. En l'absence de constructeur, l'outil ne parvient pas à produire quoi que ce soit.

**dspot**

2 tests générés pour un taux de couverture de 71% (2 branches non atteintes). Le test existant est complété par une assertion manquante (à condition que je n'affecte pas le résultat dans une variable). Un autre test est ajouté avec la valeur `Integer.MAX_VALUE` (NumberLiteralAmplifier).

### Exemple 3 - Pile d'objects

Usecase pour éprouver les mouvements d'état d'un objet simple.

**evosuite**

12 tests générés, pour une couverture de 100%. 
Les tests sont plutôt bien pensés : `pop` sur une stack vide produit une exception, `push` sur une stack pleine produit une exception, différents cas de `isFull` et `isEmpty`, ...

**randoop**

306 tests d'erreur et 1051 tests de non-régression. Les tests en erreur sont différents symptômes des 3 usecases d'erreur.
Couverture de 95%.

**jwalk**

J'ai du tricher pour aider JWalk à bien interprêter ma structure. J'ai rajouté un attribut privé sur la taille de la pile (alors que j'aurais pu m'en sortir avec la liste d'éléments).
JWalk me trouve plusieurs états de haut niveaux : Default (i.e not empty et not full), Empty et Full.
Et il arrive à trouver les séquences pour arriver à ces états.

**dspot**

4 tests généré dont 1 amplifié d'assertions. Il m'invente quelques séquences intéressantes et me trouve un usecase d'exception.
Couverture de 85%.

### Exemple 4 - FizzBuzz generator

Usecase plus complexe que l'exemple 2 pour éprouver la capacité des outils à trouver les bonnes inputs.

**evosuite**

4 tests générés. Le "Fizz" et le "Buzz" sont trouvés + 2 tests qui couvrent l'autre cas (1 seul suffirait).

### Exemple 6 - Interactions without implementation

Usecase pour découvrir les fonctionnalités de mocking des outils de génération.

**jwalk**

JWalk ne sait pas instancier un objet de type Media et nous met l'erreur suivante : "No test input could be synthesised for the parameter type : Media. Please supply a custom generator".
