package com.example.demo;

import javafx.animation.*;
import javafx.event.ActionEvent;
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
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SplashscreenController implements Initializable {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Line line_up;
    @FXML
    private Line line_down;
    @FXML
    private Line line_right;
    @FXML
    private Line line_left;
    @FXML
    private Text textS;
    @FXML
    private Text textU1;
    @FXML
    private Text textD;
    @FXML
    private Text textO;
    @FXML
    private Text textK;
    @FXML
    private Text textU2;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMenu(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        anchorPane.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
        ParallelTransition parallelTransition = new ParallelTransition(textAppearing(), linesTransition(), pause(700));
        parallelTransition.setCycleCount(2);
        parallelTransition.setAutoReverse(true);
        parallelTransition.play();


    }

    public Animation pause(double milis) {
        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(Duration.millis(3300 + milis));
        return translateTransition;
    }

    public Animation textAppearing() {
        FadeTransition fadeS = new FadeTransition();

        fadeS.setNode(textS);
        fadeS.setDuration(Duration.millis(1800));
        fadeS.setFromValue(0);
        fadeS.setToValue(1);
        fadeS.setInterpolator(Interpolator.DISCRETE);
        FadeTransition fadeU1 = new FadeTransition();
        fadeU1.setNode(textU1);
        fadeU1.setDuration(Duration.millis(300));
        fadeU1.setFromValue(0);
        fadeU1.setToValue(1);
        fadeU1.setInterpolator(Interpolator.DISCRETE);

        FadeTransition fadeD = new FadeTransition();
        fadeD.setNode(textD);
        fadeD.setDuration(Duration.millis(300));
        fadeD.setFromValue(0);
        fadeD.setToValue(1);
        fadeD.setInterpolator(Interpolator.DISCRETE);

        FadeTransition fadeO = new FadeTransition();
        fadeO.setNode(textO);
        fadeO.setDuration(Duration.millis(300));
        fadeO.setFromValue(0);
        fadeO.setToValue(1);
        fadeO.setInterpolator(Interpolator.DISCRETE);

        FadeTransition fadeK = new FadeTransition();
        fadeK.setNode(textK);
        fadeK.setDuration(Duration.millis(300));
        fadeK.setFromValue(0);
        fadeK.setToValue(1);
        fadeK.setInterpolator(Interpolator.DISCRETE);

        FadeTransition fadeU2 = new FadeTransition();
        fadeU2.setNode(textU2);
        fadeU2.setDuration(Duration.millis(300));
        fadeU2.setFromValue(0);
        fadeU2.setToValue(1);
        fadeU2.setInterpolator(Interpolator.DISCRETE);

        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(fadeS, fadeU1, fadeD, fadeO, fadeK, fadeU2);


        Font myFont = null;
        try {
            myFont = Font.loadFont(new FileInputStream(new File("src/main/resources/fonts/ARCADECLASSIC.TTF")), 150);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        textS.setFont(myFont);
        textU1.setFont(myFont);
        textD.setFont(myFont);
        textO.setFont(myFont);
        textK.setFont(myFont);
        textU2.setFont(myFont);


        return sequentialTransition;
    }

    public Animation linesTransition() {
        TranslateTransition translateDown = new TranslateTransition();
        translateDown.setNode(line_up);
        translateDown.setByY(160);
        translateDown.setDuration(Duration.millis(1500));
        //translateDown.play();

        TranslateTransition translateUp = new TranslateTransition();
        translateUp.setNode(line_down);
        translateUp.setByY(-160);
        translateUp.setDuration(Duration.millis(1500));
        //translateUp.play();

        TranslateTransition translateRight = new TranslateTransition();
        translateRight.setNode(line_left);
        translateRight.setByX(160);
        translateRight.setDuration(Duration.millis(1500));
        //translateRight.play();

        TranslateTransition translateLeft = new TranslateTransition();
        translateLeft.setNode(line_right);
        translateLeft.setByX(-160);
        translateLeft.setDuration(Duration.millis(1500));
        //translateLeft.play();

        ParallelTransition parallelTransition = new ParallelTransition(translateLeft, translateRight, translateDown, translateUp);
        return parallelTransition;
    }
}
