package Part9;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

	private ArrayList<Double> history;
	
	public ChangeHistory() {
		history = new ArrayList<>();
	}
	
	public void add(double status) {
		history.add(status);
	}
	
	public void clear() {
		history = new ArrayList<>();
	}
	
	public double maxValue() {
		return Collections.max(history);
	}
	
	public double minValue() {
		return Collections.min(history);
	}
	
	public double average() {
		double sum = 0; 
		for (double i: history) {
			sum += i;
		}
		return sum / history.size();
	}
	
	@Override
	public String toString() {
		return history.toString();
	}

}
