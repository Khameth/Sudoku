package com.example.demo;

import com.example.demo.app.HardLevel;
import com.example.demo.app.SudokuMaker;
import com.example.demo.app.SudokuSolver;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DeskController implements Initializable {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Text text11;
    @FXML
    private Text text12;
    @FXML
    private Text text13;
    @FXML
    private Text text14;
    @FXML
    private Text text15;
    @FXML
    private Text text16;
    @FXML
    private Text text17;
    @FXML
    private Text text18;
    @FXML
    private Text text19;
    @FXML
    private Text text21;
    @FXML
    private Text text22;
    @FXML
    private Text text23;
    @FXML
    private Text text24;
    @FXML
    private Text text25;
    @FXML
    private Text text26;
    @FXML
    private Text text27;
    @FXML
    private Text text28;
    @FXML
    private Text text29;
    @FXML
    private Text text31;
    @FXML
    private Text text32;
    @FXML
    private Text text33;
    @FXML
    private Text text34;
    @FXML
    private Text text35;
    @FXML
    private Text text36;
    @FXML
    private Text text37;
    @FXML
    private Text text38;
    @FXML
    private Text text39;
    @FXML
    private Text text41;
    @FXML
    private Text text42;
    @FXML
    private Text text43;
    @FXML
    private Text text44;
    @FXML
    private Text text45;
    @FXML
    private Text text46;
    @FXML
    private Text text47;
    @FXML
    private Text text48;
    @FXML
    private Text text49;
    @FXML
    private Text text51;
    @FXML
    private Text text52;
    @FXML
    private Text text53;
    @FXML
    private Text text54;
    @FXML
    private Text text55;
    @FXML
    private Text text56;
    @FXML
    private Text text57;
    @FXML
    private Text text58;
    @FXML
    private Text text59;
    @FXML
    private Text text61;
    @FXML
    private Text text62;
    @FXML
    private Text text63;
    @FXML
    private Text text64;
    @FXML
    private Text text65;
    @FXML
    private Text text66;
    @FXML
    private Text text67;
    @FXML
    private Text text68;
    @FXML
    private Text text69;
    @FXML
    private Text text71;
    @FXML
    private Text text72;
    @FXML
    private Text text73;
    @FXML
    private Text text74;
    @FXML
    private Text text75;
    @FXML
    private Text text76;
    @FXML
    private Text text77;
    @FXML
    private Text text78;
    @FXML
    private Text text79;
    @FXML
    private Text text81;
    @FXML
    private Text text82;
    @FXML
    private Text text83;
    @FXML
    private Text text84;
    @FXML
    private Text text85;
    @FXML
    private Text text86;
    @FXML
    private Text text87;
    @FXML
    private Text text88;
    @FXML
    private Text text89;
    @FXML
    private Text text91;
    @FXML
    private Text text92;
    @FXML
    private Text text93;
    @FXML
    private Text text94;
    @FXML
    private Text text95;
    @FXML
    private Text text96;
    @FXML
    private Text text97;
    @FXML
    private Text text98;
    @FXML
    private Text text99;
    @FXML
    private Rectangle rectangle11;
    @FXML
    private Rectangle rectangle12;
    @FXML
    private Rectangle rectangle13;
    @FXML
    private Rectangle rectangle14;
    @FXML
    private Rectangle rectangle15;
    @FXML
    private Rectangle rectangle16;
    @FXML
    private Rectangle rectangle17;
    @FXML
    private Rectangle rectangle18;
    @FXML
    private Rectangle rectangle19;
    @FXML
    private Rectangle rectangle21;
    @FXML
    private Rectangle rectangle22;
    @FXML
    private Rectangle rectangle23;
    @FXML
    private Rectangle rectangle24;
    @FXML
    private Rectangle rectangle25;
    @FXML
    private Rectangle rectangle26;
    @FXML
    private Rectangle rectangle27;
    @FXML
    private Rectangle rectangle28;
    @FXML
    private Rectangle rectangle29;
    @FXML
    private Rectangle rectangle31;
    @FXML
    private Rectangle rectangle32;
    @FXML
    private Rectangle rectangle33;
    @FXML
    private Rectangle rectangle34;
    @FXML
    private Rectangle rectangle35;
    @FXML
    private Rectangle rectangle36;
    @FXML
    private Rectangle rectangle37;
    @FXML
    private Rectangle rectangle38;
    @FXML
    private Rectangle rectangle39;
    @FXML
    private Rectangle rectangle41;
    @FXML
    private Rectangle rectangle42;
    @FXML
    private Rectangle rectangle43;
    @FXML
    private Rectangle rectangle44;
    @FXML
    private Rectangle rectangle45;
    @FXML
    private Rectangle rectangle46;
    @FXML
    private Rectangle rectangle47;
    @FXML
    private Rectangle rectangle48;
    @FXML
    private Rectangle rectangle49;
    @FXML
    private Rectangle rectangle51;
    @FXML
    private Rectangle rectangle52;
    @FXML
    private Rectangle rectangle53;
    @FXML
    private Rectangle rectangle54;
    @FXML
    private Rectangle rectangle55;
    @FXML
    private Rectangle rectangle56;
    @FXML
    private Rectangle rectangle57;
    @FXML
    private Rectangle rectangle58;
    @FXML
    private Rectangle rectangle59;
    @FXML
    private Rectangle rectangle61;
    @FXML
    private Rectangle rectangle62;
    @FXML
    private Rectangle rectangle63;
    @FXML
    private Rectangle rectangle64;
    @FXML
    private Rectangle rectangle65;
    @FXML
    private Rectangle rectangle66;
    @FXML
    private Rectangle rectangle67;
    @FXML
    private Rectangle rectangle68;
    @FXML
    private Rectangle rectangle69;
    @FXML
    private Rectangle rectangle71;
    @FXML
    private Rectangle rectangle72;
    @FXML
    private Rectangle rectangle73;
    @FXML
    private Rectangle rectangle74;
    @FXML
    private Rectangle rectangle75;
    @FXML
    private Rectangle rectangle76;
    @FXML
    private Rectangle rectangle77;
    @FXML
    private Rectangle rectangle78;
    @FXML
    private Rectangle rectangle79;
    @FXML
    private Rectangle rectangle81;
    @FXML
    private Rectangle rectangle82;
    @FXML
    private Rectangle rectangle83;
    @FXML
    private Rectangle rectangle84;
    @FXML
    private Rectangle rectangle85;
    @FXML
    private Rectangle rectangle86;
    @FXML
    private Rectangle rectangle87;
    @FXML
    private Rectangle rectangle88;
    @FXML
    private Rectangle rectangle89;
    @FXML
    private Rectangle rectangle91;
    @FXML
    private Rectangle rectangle92;
    @FXML
    private Rectangle rectangle93;
    @FXML
    private Rectangle rectangle94;
    @FXML
    private Rectangle rectangle95;
    @FXML
    private Rectangle rectangle96;
    @FXML
    private Rectangle rectangle97;
    @FXML
    private Rectangle rectangle98;
    @FXML
    private Rectangle rectangle99;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Text[][] texts = loadText();
        textFont(texts);
        Rectangle[][] rectangles = loadRectangle();

        int[][] desk = SudokuMaker.generateUnsolvedSudoku(HardLevel.EASY);

        putValuesOnScreen(texts,desk);
        boxesHighlights(rectangles, texts, desk);

        SudokuSolver.solve(desk);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(" " + desk[i][j]);
            }
            System.out.println();
        }

    }
    public Text[][] loadText(){
        Text[][] texts = {
                {text11, text12, text13, text14, text15, text16, text17, text18, text19},
                {text21, text22, text23, text24, text25, text26, text27, text28, text29},
                {text31, text32, text33, text34, text35, text36, text37, text38, text39},
                {text41, text42, text43, text44, text45, text46, text47, text48, text49},
                {text51, text52, text53, text54, text55, text56, text57, text58, text59},
                {text61, text62, text63, text64, text65, text66, text67, text68, text69},
                {text71, text72, text73, text74, text75, text76, text77, text78, text79},
                {text81, text82, text83, text84, text85, text86, text87, text88, text89},
                {text91, text92, text93, text94, text95, text96, text97, text98, text99}};

        return texts;
    }

    public Rectangle[][] loadRectangle(){
        Rectangle[][] rectangles = {
                {rectangle11, rectangle12, rectangle13, rectangle14, rectangle15, rectangle16, rectangle17, rectangle18, rectangle19},
                {rectangle21, rectangle22, rectangle23, rectangle24, rectangle25, rectangle26, rectangle27, rectangle28, rectangle29},
                {rectangle31, rectangle32, rectangle33, rectangle34, rectangle35, rectangle36, rectangle37, rectangle38, rectangle39},
                {rectangle41, rectangle42, rectangle43, rectangle44, rectangle45, rectangle46, rectangle47, rectangle48, rectangle49},
                {rectangle51, rectangle52, rectangle53, rectangle54, rectangle55, rectangle56, rectangle57, rectangle58, rectangle59},
                {rectangle61, rectangle62, rectangle63, rectangle64, rectangle65, rectangle66, rectangle67, rectangle68, rectangle69},
                {rectangle71, rectangle72, rectangle73, rectangle74, rectangle75, rectangle76, rectangle77, rectangle78, rectangle79},
                {rectangle81, rectangle82, rectangle83, rectangle84, rectangle85, rectangle86, rectangle87, rectangle88, rectangle89},
                {rectangle91, rectangle92, rectangle93, rectangle94, rectangle95, rectangle96, rectangle97, rectangle98, rectangle99}};

        return rectangles;
    }


    public void boxesHighlights(Rectangle[][] rectangles, Text[][] texts, int[][] desk) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                Rectangle rectangle = rectangles[i][j];
                Text text = texts[i][j];

                if (!text.getText().equals("")){
                    rectangle.setMouseTransparent(true);
                }

                rectangle.setOnMouseEntered(event -> {
                    ((Rectangle) event.getSource()).setFill(new Color(0.8842, 0.8842, 0.8842, 1.0));
                });

                rectangle.setOnMouseClicked(event -> {
                    if (event.getButton() == MouseButton.PRIMARY) {
                        // handle left click
                        if (text.getText().equals("") || text.getText().equals("9")) text.setText("0");
                        int value = Integer.parseInt(text.getText());
                        text.setText(String.valueOf(value+1));
                    } else if (event.getButton() == MouseButton.SECONDARY) {
                        // handle right click
                        text.setText("");
                    } else if (event.getButton() == MouseButton.MIDDLE) {
                        // handle middle click
                        if  (control(desk)) {
                            try {
                                switchToCongratScreen();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.println("f" + control(desk));
                    }
                    text.setFill(Color.BLUE);
                });

                rectangle.setOnMouseExited(event -> {
                    ((Rectangle) event.getSource()).setFill(new Color(1.0, 1.0, 1.0, 1.0));
                });
            }
        }
    }

    public void textFont(Text[][] texts) {
        Font myFont = null;
        try {
            myFont = Font.loadFont(new FileInputStream("src/main/resources/fonts/ARCADECLASSIC.TTF"), 50);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                texts[i][j].setFont(myFont);
            }
        }
    }

    public void putValuesOnScreen(Text[][] texts,int[][] desk) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                texts[i][j].setText(String.valueOf(desk[i][j]));
                if (desk[i][j] == 0) texts[i][j].setText("");
            }
        }
    }

    public boolean control(int[][] desk){
        Text[][] texts = loadText();
        SudokuSolver.solve(desk);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!texts[i][j].getText().equals(String.valueOf(desk[i][j])))  return false;
            }
        }
        return true;
    }

    public void switchToCongratScreen() throws IOException {
        root = FXMLLoader.load(getClass().getResource("congratulation_screen.fxml"));
        stage = (Stage) rectangle11.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
