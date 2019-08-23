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

- **evosuite**: 10 tests générés, dont la multiplication par 0, la division par 0 (exception), le reset à 0, pour un taux de couverture de 100%
- **randoop**: 1894 tests générés, dont 64 tests d'erreur uniquement à cause de la division par 0, pour un taux de couverture de 100%
- **jwalk**: la heap memory monte en flêche jusqu'à 3GB. Je n'ai pas pu aller jusqu'au bout avec cet exemple.
