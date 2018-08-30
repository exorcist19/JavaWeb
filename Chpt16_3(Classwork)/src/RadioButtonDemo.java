import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class RadioButtonDemo extends Application {
	public void start(Stage primaryStage) {
		BorderPane pane =  new BorderPane();
		VBox paneForRadioButtons = new VBox(20);
		paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
		paneForRadioButtons.setStyle
	("-fx-border-width: 2px; -fx-border-color: green");
  RadioButton rbRed = new RadioButton("Red");
  RadioButton rbYellow = new RadioButton("Yellow");
  RadioButton rbGreen = new RadioButton("Green");
  Circle circle = new Circle(10);
  paneForRadioButtons.getChildren().addAll(rbRed, rbYellow, rbGreen,circle);
  pane.setLeft(paneForRadioButtons);
 
  ToggleGroup group= new ToggleGroup();
  rbRed.setToggleGroup(group);
  rbYellow.setToggleGroup(group);
  rbGreen.setToggleGroup(group);
  
  rbRed.setOnAction(e -> {
	  if (rbRed.isSelected()) { 
		  circle.setFill(Color.RED);
	  }
  });
  
  rbYellow.setOnAction(e-> {
	  if (rbYellow.isSelected()) {
		  circle.setFill(Color.YELLOW);
	  }
  });
  
  
  rbGreen.setOnAction(e-> {
	  if (rbGreen.isSelected()) {
		  circle.setFill(Color.GREEN);
	  }
  });
		
  //	return pane;
  
  Scene scene = new Scene(pane);
	primaryStage.setTitle("HandleEvent");
	primaryStage.setScene(scene);
	primaryStage.show();
  }
				
  public static void main(String[] args) {
	launch(args);
	
		
	}
}
