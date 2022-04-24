module com.wordle.wordlehelper {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    exports com.wordle.controller;
    opens com.wordle.controller to javafx.fxml;
}