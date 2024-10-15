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

        Pane pane = new Pane(); // Contenedor grafico que contendra los elementos
        Text text = new Text(5,10,"Programming is fun"); // Colocamos el objeto texto en la posicion 5 10 con "Programming is fun"
        
        text.setOnMouseDragged(e ->{ // creamos un evento si dejas el raton pulsado sobre el texto
            text.setX(e.getX());
            text.setY(e.getY());
        });

        pane.getChildren().add(text); // agrega texto al contenedor

        Scene scene = new Scene(pane, 600, 400); // le damos tamanio a la ventana
        primaryStage.setTitle("Ejemplo de arrastre"); // colocamos un titulo
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
