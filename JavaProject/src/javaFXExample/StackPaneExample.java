package javaFXExample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;

public class StackPaneExample extends Application{
	public void start(Stage stage) {
		Button b1=new Button("Click");
		//Button b2=new Button("Click");
		TextField t=new TextField();
		
		
		StackPane root=new StackPane();
		Scene scene=new Scene(root,400,400);
		root.getChildren().addAll(t,b1);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		
launch(args);
	}

}
