package javaFXExample;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.application.Application;

public class PaneExample extends Application{
	public void start(Stage stage) {
		Button button=new Button("Click");
		Pane pane=new Pane();
		Scene scene=new Scene(pane,400,400);
		
		button.setLayoutX(100);
		button.setLayoutX(50);
		pane.getChildren().add(button);
		
		stage.setTitle("Pane Example");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}