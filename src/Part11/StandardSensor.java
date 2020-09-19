package Part11;

public class StandardSensor implements Sensor {
	private int sensorNum;
	private boolean isOn;
	public StandardSensor(int num) {
		this.sensorNum = num;
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
		return this.sensorNum;
	}

}
