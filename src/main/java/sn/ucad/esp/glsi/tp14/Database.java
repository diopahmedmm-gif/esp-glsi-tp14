package sn.ucad.esp.glsi.tp14;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Connexion a la base MySQL. Les parametres sont lus dans db.properties
 * (a la racine du projet, jamais publie : voir db.properties.exemple).
 */
public final class Database {

    private Database() { }

    static Properties config() throws IOException {
        Properties p = new Properties();
        try (InputStream in = Files.newInputStream(Path.of("db.properties"))) {
            p.load(in);
        }
        return p;
    }

    public static Connection connecter() throws IOException, SQLException {
        Properties p = config();
        String url = "jdbc:mysql://" + p.getProperty("db.host") + ":" + p.getProperty("db.port")
                + "/" + p.getProperty("db.name");
        return DriverManager.getConnection(url, p.getProperty("db.user"), p.getProperty("db.password"));
    }

    /** Petit texte pour le titre de la fenetre : la connexion fonctionne-t-elle ? */
    public static String etatConnexion() {
        try (Connection c = connecter()) {
            return "connecte a " + c.getCatalog() + " (MySQL " + c.getMetaData().getDatabaseProductVersion() + ")";
        } catch (IOException | SQLException e) {
            return "base de donnees non connectee";
        }
    }
}
