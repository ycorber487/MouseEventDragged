package org.example.di_formdesign_cortesyon;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        Text text = new Text(5,10,"Programming is fun");
        
        text.setOnMouseDragged(e ->{
            text.setX(e.getX());
            text.setY(e.getY());
        });

        pane.getChildren().add(text);

        Scene scene = new Scene(pane, 600, 400);
        primaryStage.setTitle("Ejemplo de arrastre");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
