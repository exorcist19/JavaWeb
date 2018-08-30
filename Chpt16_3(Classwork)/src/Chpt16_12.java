import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Chpt16_12 extends Application {
	

			
				
		public static void main(String[] args) {
			launch(args);
	     
		}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		TextArea  t= new TextArea();
		CheckBox Ckedit = new CheckBox("edit");
		CheckBox CKwrap = new CheckBox("Wrap");
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(t, Ckedit, CKwrap);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("HandleEvent");
		primaryStage.setScene(scene);
		primaryStage.show();	
	
	
		Ckedit.setOnAction(e-> {
			 
		t.setEditable(Ckedit.isSelected());
		
		
		});
			  
		CKwrap.setOnAction(e-> {
		t.setWrapText(CKwrap.isSelected());			  
	  
		});		  
	}
}
