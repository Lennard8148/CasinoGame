module ila.casino {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;
    requires jdk.compiler;


    opens ila.casino to javafx.fxml;
    exports ila.casino;
}