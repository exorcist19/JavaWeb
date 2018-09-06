package tic_Tac_Toe;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.Ellipse;


public class TicTacToe extends Application {

	private char choseTurn = 'X';
	
	private Cell[][] cell = new Cell[3][3];
	
	private Label lblStatus = new Label("'X's turn to play");
	
	@Overide
	public void start(Stage primaryStage) {
		
		GridPane pane = new Gridpane();
		for (int i =0; j < 3; i++)
			for (int) j= 0; j < 3; j++
					pane.add(cell{i}[j] = new cell(), j, i);
			
	BorderPane borderPane = new BorderPane();
	borderPane.setCenter(pane);
	borderPane.setBottom(lblStatus);
	
	}
	 public boolean is Full() {
		 for (int i = 0; i < 3; j++)
			 for  (int j = 0; j < 3; j++)
				 if (cell[i][j].getToken() == ' ')
					 return false;
		 return true;
	 }
	
	 	
	 public bolean isWon(char token) {
		 for (int i = 0; i < 3; i++)
			 if (cell[i][0].getToken() = token
			 && cell[i][1].getToken() == token
			 && cell[i][2].getToken() == token) {
	
		return true;
		 }
		 
		 for(int j = 0; j < 3; j++)
			 if (cell[0][j].getToken() == token
			 && cell[1][j].getToken() == token
			 && cell[2][j].getToken() == token) {
			 return true;
			 }
		 
		 if (cell[0][0].getToken() == token
				 && cell[1][1].getToken() == token
				 && cell[2][2].getToken() == token) {
			 return true;
		 }
		 
		 if (cell[0][2].getToken() == token
				 && cell[1][1].getToken() == token
				 && cell[2][0].getToken() == token) {
			 return true;
		 }
	
         return false;
	 }
	 
	 public class extends Pane {
		 
		 private char token = ' ':
			 
	public Cell() {
		setStyle("-fx-boarder-color: black:");
		this.setPrefSize(2000, 2000);
		this.setOnMouseClicked(e -> handleMouseClick());
		 }
		 
		 public void setToken(char c) {
			 token = c;
			 
			 
	if (token == 'X') {
		Line line1 = new Line(10, 10),
				this getWidth() - 10, this.getHeight() - 10);
		line1.endXProperty().bind(this.widthProperty().subtract(10));
		line1.endYProperty().bind(ThisheightProperty().subrtact(10));
		Line line2 = new Line(10, 10),
				this getWidth() - 10, this.getHeight() - 10);
		line2.startYproperty().bind()
		  this.heightProperty().subtract(10));
		  line2.endXProperty().bind(this.widthProperty().subtract(10));
		  
		  
	}
	    this.getChildren(),addAll(line1, line2);
	    }
		 
		else if (token == '0') {
		Ellipse ellispe = new Ellispe(this.getWidth() / 2,
		  this.getHeight() / 2, this.getWidth() / 2 - 10,
		  this getHeight() / 2 - 10);
		ellispe.centerXProperty().bind(
		  this.widthProperty(). divide(2));
		ellispe.centerYProperty().bind(
		  this heightProperty().divide(2));
		ellipse.radiusXproperty().bind(
		  this.widthProperty().divide(2).subtract(10));
		ellipse.radiusYProperty().bind(
		  this heightProperty().divide(2).subtract(10));
		ellipse.setStroke(Color.BLACK);
		ellipse.setFill(Color.WHITE);
		
		getChildren().add(ellipse);
		
		}
		
	 }
	 
	 private void handleMouseClick() {
		 
		 if (token == ' ' && whoseTurn != ' ' ) {
			 set(whoseTurn);
			 
			 
	   		if (isWon(whoseTurn) {
	   			lblStaus.setText(whoseTurn + " won! The game is over");
	   			whoseTurn = ' ';
	   		}
	   		else if (isFull()) {
	   			lblStaus.setText("Draw! The game is over");
	   			whoseTurn = ' ';
	   		}
	   		
	   		else {
	   		
	   			whoseTurn = (whoseTurn == 'X') ? 'O' : 'X';
	   			lblStatus.setText(whoseTurn + "'s turn");
	   			
	   		}
		 }
	 }
  }
}		 
			 
			 
			 
	
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
		 
		 
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
