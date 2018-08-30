package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

	

public void start(Stage primaryStage) {
	//Create a button and place it in the scene
	Button btOK = new Button("Ok");
	Scene scene = new Scene(btOK, 200, 250);
	primaryStage.setTitle("MyJavaFx");
	primaryStage.setScene(scene);
	primaryStage.show();
	
}
	public static void main(String[] args ) {
		 launch(args);
	}
}

