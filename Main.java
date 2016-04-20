package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("recipe.fxml"));
        Scene scene = new Scene(root);
        String cssFile = String.valueOf(getClass().getResource("appCss.css"));
        scene.getStylesheets().add(cssFile);
        primaryStage.setTitle("Page Creator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}


