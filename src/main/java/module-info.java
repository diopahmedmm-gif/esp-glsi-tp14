module sn.ucad.esp.glsi.tp14 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens sn.ucad.esp.glsi.tp14 to javafx.fxml;
    exports sn.ucad.esp.glsi.tp14;
}
