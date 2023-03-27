package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuButtonController implements Initializable {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    Text play_button;
    @FXML
    Text rules_button;
    @FXML
    Text exit_button;
    @FXML
    Rectangle butPlay;
    @FXML
    Rectangle butRules;
    @FXML
    Rectangle butExit;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        anchorPane.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
        Font myFont = null;
        try {
            myFont = Font.loadFont(new FileInputStream(new File("src/main/resources/fonts/ARCADECLASSIC.TTF")), 50);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        play_button.setFont(myFont);
        rules_button.setFont(myFont);
        exit_button.setFont(myFont);
    }

    public void switchToHard(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hard_level.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
