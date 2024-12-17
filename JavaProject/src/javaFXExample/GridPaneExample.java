package javaFXExample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

//public class GridPaneExample extends Application{
//public void start(Stage stage) {
//Label u=new Label("Username");
//Label p=new Label("Password");
//
//TextField uname=new TextField();
//PasswordField pwd=new PasswordField();
//Button login=new Button("Log in");
//	
//GridPane root=new GridPane();
//root.setHgap(5);
//root.setVgap(5);
//
//root.addColumn(0,u,p);
//root.addColumn(1,uname,pwd,login);
//Scene scene=new Scene(root,400,400);
//
//
//	//root.getChildren().addAll(b1,t);
//
//
//	stage.setScene(scene);
//	stage.show();
//}
//	public static void main(String[] args) {
//		
//launch(args);
//	}
//
//}

public class GridPaneExample extends Application{
	public void start(Stage stage) {
		Label u=new Label("Username");
		Label p=new Label("Password");
		
		TextField uname=new TextField();
		TextField pwd=new TextField();
		Button login=new Button("Log in");
		
		GridPane root=new GridPane();
		Scene scene=new Scene(root,400,400);
root.getHgap();
root.getVgap();
root.addColumn(0,u,p);
root.addColumn(1,uname,pwd,login);

stage.setScene(scene);
stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}