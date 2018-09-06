package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class MainController implements Initializable {
	
	static Vector<User> Users= new Vector<User>();
	ObservableList<User> users = FXCollections.observableArrayList();
	
	static User user = new User();
	
	
	@FXML
	public ListView lbUsers;
	@FXML
	public Label outputUsername;
	@FXML
	public Label outputPassword;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Users = UserDA.retrieveAll();
//		users.addAll(Users);
//		
//		lbUsers.setItems(users);
		try {
			user = UserDA.retrieve(1);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			user.setUsername("John Doe");
			user.setPassword("Shouldn't be seeing this!");
			e.printStackTrace();
		}
		outputUsername.setText(user.getUsername());
		outputPassword.setText(user.password);
		
	}
	
}
