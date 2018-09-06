package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class MainController implements Initializable {

	@FXML
	private Label output;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		System.out.println("Run initializer methods here");
	}
	
	// Make sure the ActionEvent import references JFXM library not AWT
	public void BtnClick (ActionEvent event) {
		//System.out.println("Clicked!");
		output.setText("Hello,World!");
	}

}
