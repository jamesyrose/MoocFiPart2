package Part14;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SavingsCalculator extends Application {

	@Override
	public void start(Stage window) throws Exception {	
		// Sliders
		Slider monthly = new Slider();
		monthly.setMin(0);
		monthly.setMax(1000);
		monthly.setBlockIncrement(50);
		monthly.setValue(200);
		monthly.setShowTickLabels(true);
		monthly.setShowTickMarks(true);
		monthly.setMajorTickUnit(50);
		Slider intrest = new Slider();
		intrest.setMin(0);
		intrest.setMax(.1);
		intrest.setValue(.02);
		intrest.setBlockIncrement(.005);
		intrest.setShowTickLabels(true);
		intrest.setShowTickMarks(true);
		intrest.setMajorTickUnit(.005);
		
		// Initiate Graph 
		NumberAxis xAxis = new NumberAxis();
		NumberAxis yAxis = new NumberAxis();
		xAxis.setLabel("Months");
		yAxis.setLabel("Saving $");
		LineChart<Number, Number> lineChart = new LineChart(xAxis, yAxis);
		lineChart.setTitle("Savings");
		
		List<Double> data = getChart(monthly.getValue(), intrest.getValue());
		XYChart.Series buffData = new XYChart.Series();
		for (int i=0; i<data.size(); i++) {
			buffData.getData().add(new XYChart.Data(i, data.get(i)));
		}
		lineChart.getData().add(buffData);
		
		// updating chart
		monthly.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                    Number oldVal, Number newVal) {
        		List<Double> data = getChart(monthly.getValue(), intrest.getValue());
        		XYChart.Series buffData = new XYChart.Series();
        		for (int i=0; i<data.size(); i++) {
        			buffData.getData().add(new XYChart.Data(i, data.get(i)));
        		}
        		lineChart.getData().clear();
        		lineChart.getData().add(buffData);
                }
		});
		
		intrest.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                    Number oldVal, Number newVal) {
        		List<Double> data = getChart(monthly.getValue(), intrest.getValue());
        		XYChart.Series buffData = new XYChart.Series();
        		for (int i=0; i<data.size(); i++) {
        			buffData.getData().add(new XYChart.Data(i, data.get(i)));
        		}
        		lineChart.getData().clear();
        		lineChart.getData().add(buffData);
                }
		});
		
		
		// Label
		Label monthLabel = new Label("    Monthly Contribution");
		monthLabel.setFont(new Font(24));
		Label intrestLabel = new Label("    Intrest Rate");
		intrestLabel.setFont(new Font(24));
		
		// VBox
		VBox structure = new VBox();
		structure.getChildren().addAll(monthLabel, monthly, intrestLabel, intrest, lineChart);
		//Scene 
		Scene scene = new Scene(structure, 1000, 600);
		
		window.setScene(scene);
		window.show();
	}
	
	public List<Double> getChart(double monthly, double intrest){

		
		// Generate Data
		double money = 0;
		List<Double> data = new ArrayList<>();
		for (int i=0; i<48; i++) {
			data.add(money);
			money *= (1 + intrest);
			money += monthly;
		}
		return data;
	}
	
	public static void main(String[] args) {
		launch();
	}

}
