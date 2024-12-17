package javaFXExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonExample extends Application {
    @Override
    public void start(Stage stage) {
        ToggleGroup group = new ToggleGroup();

        RadioButton rb1 = new RadioButton("Option 1");
        RadioButton rb2 = new RadioButton("Option 2");
        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);

        VBox root = new VBox(10, rb1, rb2);
        Scene scene = new Scene(root, 300, 100);

        stage.setTitle("RadioButton Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

