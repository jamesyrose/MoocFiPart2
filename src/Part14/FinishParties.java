package Part14;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class FinishParties extends Application{

	@Override
	public void start(Stage window) throws Exception {
		// Data 
		List<String> data = getData("src/Part14/partiesdata.tsv");
		
		// creating axis
		NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
		NumberAxis yAxis = new NumberAxis(0, 30, 5);
		
		// Set Labels
		xAxis.setLabel("Year");
		yAxis.setLabel("Count");
		
		
		// INITIALIZE CHART
		LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
		lineChart.setTitle("Parties Data");

		// Axis Labels 
		String[] years = data.get(0).split("\t");
		for (int i=1; i<data.size(); i++) {
			String[] buff = data.get(i).split("\t");
			XYChart.Series buffData = new XYChart.Series();
			buffData.setName(buff[0]);
			for (int j=1; j<years.length; j++) {
				int year = Integer.parseInt(years[j]);
				double point = 0;
				try { 
					point = Double.parseDouble(buff[j]);
				} catch (Exception e) {
					e.getStackTrace();
				}
				
				buffData.getData().add(new XYChart.Data(year, point));
			}
			lineChart.getData().add(buffData);
		}
		Scene view = new Scene(lineChart, 600, 600);
		window.setScene(view);
		window.show();
	}
	
	public static List<String> getData(String filePath){
		List<String> data = new ArrayList<>();
		try {
			Scanner reader = new Scanner(Paths.get(filePath));
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				data.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	public static void main(String[] args) {
		launch();
	}
	

}
