# TP 1.4 - Chaine d'outils d'un projet Java

Projet Maven du cours « L'environnement de travail et remise a niveau » (sequence 1, ESP / UCAD).

- **JDK** : Eclipse Temurin 25 LTS
- **Maven** : 3.10.0
- **JavaFX** : 25.0.5 (`javafx-controls`, `javafx-fxml`) avec `javafx-maven-plugin` 0.0.8
- **Base de donnees** : MySQL 9.7.4 avec le pilote `mysql-connector-j` 26.10.0

## Lancer le projet

1. Copier `db.properties.exemple` en `db.properties` et y mettre son mot de passe MySQL
   (ce fichier n'est jamais publie : il est dans `.gitignore`).
2. Compiler : `mvn compile`
3. Ouvrir la fenetre JavaFX (vue `vue.fxml`) : `mvn javafx:run`
4. Tester la connexion a la base exemple sakila :
   `mvn exec:java -Dexec.mainClass=sn.ucad.esp.glsi.tp14.Test_MySQL`
