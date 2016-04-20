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


    public static void toWindow(String fxmlUrl, String cssUrl) throws IOException {
        File windowfxml = new File(fxmlUrl);
        Parent root = FXMLLoader.load(windowfxml.toURL());
        Scene scene = new Scene(root);
        File maincss = new File(cssUrl);

        scene.getStylesheets().add(maincss.toURI().toString());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Page Creator");
    }

}


