package com.wordle.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WordleHelperController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}