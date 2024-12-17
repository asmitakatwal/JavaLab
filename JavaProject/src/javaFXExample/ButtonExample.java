package javaFXExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonExample extends Application {
    @Override
    public void start(Stage stage) {
        Button button = new Button("Click Me");
        button.setOnAction(e -> System.out.println("Button clicked!"));

        StackPane root = new StackPane(button);
        Scene scene = new Scene(root, 200, 100);

        stage.setTitle("Button Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

