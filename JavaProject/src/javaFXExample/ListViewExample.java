package javaFXExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ListViewExample extends Application {
    @Override
    public void start(Stage stage) {
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Item 1", "Item 2", "Item 3");

        StackPane root = new StackPane(listView);
        Scene scene = new Scene(root, 300, 150);

        stage.setTitle("ListView Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}



