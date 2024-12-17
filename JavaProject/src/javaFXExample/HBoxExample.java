package javaFXExample;

import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.layout.HBox;

public class HBoxExample extends Application{
public void start(Stage stage) {
	Button btn1=new Button("Click");
	Button btn2=new Button("Click");
	
	HBox root=new HBox();
	root.setSpacing(20);
	root.getChildren().addAll(btn1,btn2);
	Scene scene=new Scene(root,400,400);
	stage.setScene(scene);
	stage.show();
}
	public static void main(String[] args) {
		
launch(args);
	}

}
