package javaFXExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ComboBoxExample extends Application {
    @Override
    public void start(Stage stage) {
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Option 1", "Option 2", "Option 3");
        comboBox.setPromptText("Select an option");

        StackPane root = new StackPane(comboBox);
        Scene scene = new Scene(root, 300, 100);

        stage.setTitle("ComboBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}



