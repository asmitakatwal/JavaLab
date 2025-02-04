package javaFXExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LabelExample extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, World!");

        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 200, 100);

        stage.setTitle("Label Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

