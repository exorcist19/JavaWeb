package application;
	
import java.sql.Connection;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	static Connection c = null;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane(); // Remove this in place of Scene Builder object
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root); // removing alternate parameters (,400,400) in favor of default size
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, SQLException {
		System.out.println("Loaded App");
		// Get a connection object to the database
		c = DBL.initialize();
		// Initialize a connection in the User class 
        User.initialize(c);
		launch(args);
	}
}
