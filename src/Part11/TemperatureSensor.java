package Part11;

import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor implements Sensor {
	private boolean isOn;
	
	public TemperatureSensor() {
		this.isOn = true;
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
			throw new IllegalStateException("Temperature Sensor not on");
		}
		return ThreadLocalRandom.current().nextInt(-30,30);
	}

}
