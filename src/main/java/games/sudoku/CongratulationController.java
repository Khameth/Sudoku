package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class CongratulationController implements Initializable {
    @FXML
    private Text text;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Font myFont = null;
        try {
            myFont = Font.loadFont(new FileInputStream("src/main/resources/fonts/ARCADECLASSIC.TTF"), 40);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        text.setFont(myFont);
    }
}
