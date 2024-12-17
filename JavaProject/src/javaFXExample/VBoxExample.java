package javaFXExample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public class VBoxExample extends Application{
	public void start(Stage stage) {
		Button b1=new Button("Click");
		Button b2=new Button("Click");
		
		VBox root=new VBox();
		root.setSpacing(20);
		root.getChildren().addAll(b1,b2);
		
		Scene scene=new Scene(root,400,400);
		
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
