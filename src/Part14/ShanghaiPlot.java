package Part14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiPlot extends Application {

	@Override
	public void start(Stage window) throws Exception {
		NumberAxis xAxis = new NumberAxis(2007, 2017, 2);
		NumberAxis yAxis = new NumberAxis(50, 80, 4);
		
		// Set Labels
		xAxis.setLabel("Year");
		yAxis.setLabel("Ranking");
		
		// INITIALIZE CHART
		LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
		lineChart.setTitle("Shanghai Ranking");
		 
		// Create dataset
		XYChart.Series data = new XYChart.Series();
		data.setName("Ranking");
		
		data.getData().add(new XYChart.Data(2007, 73));
		data.getData().add(new XYChart.Data(2008, 68));
		data.getData().add(new XYChart.Data(2009, 72));
		data.getData().add(new XYChart.Data(2010, 72));
		data.getData().add(new XYChart.Data(2011, 74));
		data.getData().add(new XYChart.Data(2012, 73));
		data.getData().add(new XYChart.Data(2013, 76));
		data.getData().add(new XYChart.Data(2014, 73));
		data.getData().add(new XYChart.Data(2015, 67));
		data.getData().add(new XYChart.Data(2016, 56));
		data.getData().add(new XYChart.Data(2017, 56));

		
		lineChart.getData().add(data);
		Scene view = new Scene(lineChart, 600, 600);
		window.setScene(view);
		window.show();
	}

	public static void main(String[] args) {
		launch();
	}


}
