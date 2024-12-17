package javaFXExample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.TilePane;

public class TilePaneExample extends Application{
public void start(Stage stage) {
    TilePane tilePane = new TilePane();
    tilePane.setPrefColumns(2);
    tilePane.setHgap(5);
    tilePane.setVgap(5);

    Button btn1 = new Button("1");
    Button btn2 = new Button("2");
    Button btn3 = new Button("3");

    tilePane.getChildren().addAll(btn1, btn2, btn3);

    Scene scene = new Scene(tilePane, 300, 200);
    stage.setTitle("TilePane Example");
    stage.setScene(scene);
    stage.show();

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);
	}

}
