package javaFXExample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CheckBoxExample extends Application {
    @Override
    public void start(Stage stage) {
        CheckBox checkBox = new CheckBox("Subscribe to newsletter");

        StackPane root = new StackPane(checkBox);
        Scene scene = new Scene(root, 300, 100);

        stage.setTitle("CheckBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

