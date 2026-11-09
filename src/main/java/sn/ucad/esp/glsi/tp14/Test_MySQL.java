package sn.ucad.esp.glsi.tp14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Test de connexion du cours : liste les acteurs de la base exemple sakila. */
public class Test_MySQL {

    public static void main(String[] args) {
        try (Connection connection = Database.connecter();
             PreparedStatement ps = connection.prepareStatement("SELECT first_name, last_name FROM sakila.actor");
             ResultSet rs = ps.executeQuery()) {
            System.out.println("Liste des acteurs");
            while (rs.next()) {
                System.out.println(rs.getString("first_name") + " " + rs.getString("last_name"));
            }
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
