package Part13;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToe extends Application{

	private String turn;

	@Override
	public void start(Stage window) throws Exception {
		this.turn = "X";
		GridPane grid = new GridPane();
		
		// Label
		Label turnLabel = new Label("Turn " + this.turn);
		turnLabel.setFont(new Font(40));
		grid.add(turnLabel, 0, 0, 3, 1);
		// Create Buttons 
		for (int i=0; i<9; i++) {
			Button buff = new Button("");
			buff.setMinWidth(150);
			buff.setMinHeight(150);
			buff.setFont(new Font(50));
			buff.setOnAction((event) -> {
				if (buff.getText().equals("")) {
					buff.setText(this.turn);
					if (this.turn == "X") {
						this.turn = "O";
					}else {
						this.turn = "X";
					}
					turnLabel.setText("Turn " + this.turn);
				}

			});
			int row = Math.floorDiv(i, 3) + 1;
			int col = i - (row - 1) * 3; 
			grid.add(buff, col, row);
		}
		
		// create Scene
		Scene scene = new Scene(grid);
		window.setScene(scene);
		window.setTitle("Vocab Study");
		window.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
