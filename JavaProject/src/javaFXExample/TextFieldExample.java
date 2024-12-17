package javaFXExample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class TextFieldExample extends Application{
public void start(Stage stage) {
	TextField textField=new TextField();
	textField.setPromptText("Enter your name");
	StackPane root=new StackPane();
	root.getChildren().addAll(textField);
	Scene scene=new Scene(root,400,400);
	stage.setTitle("Hello");
	stage.setScene(scene);
	stage.show();
}
	public static void main(String[] args) {
		
launch();
	}

}
