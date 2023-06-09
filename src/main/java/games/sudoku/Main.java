package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("splashscreen.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("Sudoku");
        Image image = new Image(new FileInputStream("src/main/resources/images/icon.png"));
        stage.getIcons().add(image);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}