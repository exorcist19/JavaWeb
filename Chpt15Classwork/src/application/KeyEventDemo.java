package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application {

	public void start(Stage primaryStage) {
		
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK");
		Button BtCancel = new Button("Cancel");
		OkHandlerClass handler1 = new OkHandlerClass();
		btOK.setOnAction(handler1);
		CancelHandlerClass handler2 = new CancelHandlerClass();
		BtCancel.setOnAction(handler2);
		pane.getChildren().addAll(btOK, BtCancel);
		
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("HandleEvent");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
   public static void main(String[] args) {
	 launch(args);
}
	
   class OkHandlerClass implements EventHandler<ActionEvent> {
	   public void handle(ActionEvent e) {
		   System.out.println("OK button clicked");
	   }
   }
	
class CancelHandlerClass implements EventHandler<ActionEvent> {
	public void handle(ActionEvent e) {
		System.out.println("Cancel button clicked");
	}
}
}
