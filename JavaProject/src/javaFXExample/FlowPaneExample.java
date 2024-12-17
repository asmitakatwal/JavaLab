package javaFXExample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class FlowPaneExample extends Application{
public void start(Stage stage) {
	Button btn1 = new Button("Button 1");
	Button btn2 = new Button("Button 2");
	Button btn3 = new Button("Button 3");

	FlowPane flowPane = new FlowPane();
	flowPane.setHgap(10);
	flowPane.setVgap(10);
	//flowPane.setOrientation(Orientation.HORIZONTAL);

flowPane.getChildren().addAll(btn1, btn2, btn3);
Scene scene=new Scene(flowPane,400,400);
stage.setScene(scene);
stage.show();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);
	}

}
