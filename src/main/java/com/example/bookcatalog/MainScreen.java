package com.example.bookcatalog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainScreen extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainScreen.class.getResource("MainScreen.fxml"));
<<<<<<< HEAD
        FXMLLoader fxmlLoader1 = new FXMLLoader(MainScreen.class.getResource("AddBook.fxml"));
        Scene scene = new Scene(fxmlLoader1.load(), 320, 240);
=======
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
>>>>>>> main
        primaryStage.setTitle("Hello Guys!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
