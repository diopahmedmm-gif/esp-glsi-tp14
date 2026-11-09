package sn.ucad.esp.glsi.tp14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Application JavaFX : ouvre la fenetre vide decrite dans vue.fxml. */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent racine = FXMLLoader.load(App.class.getResource("vue.fxml"));
        stage.setTitle("TP 1.4 - " + Database.etatConnexion());
        stage.setScene(new Scene(racine));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
