package javaFXExample;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.control.*;
public class BorderPaneExample extends Application{
public void start(Stage stage) {
	Button top=new Button("top");
	Button bottom=new Button("bottom");
	Button left=new Button("left");
	Button right=new Button("right");
	Button center=new Button("Center");
	BorderPane root=new BorderPane();
	
	root.setTop(top);
	root.setBottom(bottom);
	root.setLeft(left);
	root.setRight(right);
	root.setCenter(center);
	
	Scene scene=new Scene(root,300,400);
stage.setScene(scene);
stage.show();
}
	public static void main(String[] args) {
		launch(args);

	}

}
