# Tests Auto Generation

Overview of tests auto generation in Java ecosystem.

The purpose of this project is to bootstrap and experiment a couple of solutions to generate Unit Test Suites automatically.

## Evosuite

http://www.evosuite.org/

### Pré-requis

- JDK 1.8 (ne fonctionne pas avec le JDK 11 en l'occurrence)

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

### Ressources
- https://vimeo.com/191006782

## Randoop

https://randoop.github.io/randoop/

### Command line

For generating test suites for specific class :

`./gradlew randoop -Ptestclass=jbhembise.testauto.example1.Calculator`


For executing all generated test suites :

`./gradlew clean randoopTest`

### Résultats

- Les tests générés ne dépendent que de JUnit, et pas d'un Runner spécifique Randoop
- Beaucoup de tests générés, pour les même cas
- tests compatibles JUnit 4

## DSpot

### Pré-requis
- Gradle < 5 pour utiliser le GradleBuilder, sinon erreur sur le "leftShift()"
- Maven
- JDK 1.8 (ne fonctionne pas avec le JDK 11 en l'occurrence)

### Command line

For generating test suites for specific class :

`./gradlew dspot -Ptestclass=jbhembise.testauto.example1.Calculator`

### Résultats

- Difficultés du setup Gradle (nécessité d'avoir un bloc `buildscript` par ex)

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
- UI très vieillote ou version en ligne de commande
- Essaye de trouver toutes les combinaisons de méthode pour une classe => pas adapté pour de simples POJOs Java
- Construit un Oracle avec le feedback de l'utilisateur. L'Oracle devine tout seul certains cas.
- A chaque changement du code source, on peut relancer l'exploration.
- Ne recherche pas les meilleures input pour maximiser le coverage (InputGenerator à fournir, ceux par défaut sont simplistes)
