package Part11;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
	private boolean isOn;
	private List<Sensor> sensors;
	
	public AverageSensor() {
		this.isOn = true;
		this.sensors = new ArrayList<>();
	}
	
	public void addSensor(Sensor sensor) {
		this.sensors.add(sensor);
	}
	
	public List<Integer> readings(){
		List<Integer> reading = new ArrayList<>();
		for (Sensor sensor: this.sensors) {
			reading.add(sensor.read());
		}
		return reading;
	}
	
	@Override
	public boolean isOn() {
		return this.isOn;
	}

	@Override
	public void setOn() {
		this.isOn = true;
	}

	@Override
	public void setOff() {
		this.isOn = false;
	}

	@Override
	public int read() {
		if (!this.isOn) {
			throw new IllegalStateException("Sensor is off");
		}
		int total = 0;
		for (Sensor s: this.sensors) {
			total += s.read();
		}
		return total;
	}

}
