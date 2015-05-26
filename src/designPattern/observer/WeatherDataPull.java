package designPattern.observer;

import java.util.Observable;

/**
 * jdk自带观察者模式测试：拉式
 * 
 * @author hj
 *
 */
public class WeatherDataPull extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void meaurementsChanged() {
		setChanged();
//		float[] obj = { temperature, humidity, pressure };
		notifyObservers();
	}

	public void setMeaurements(float temperature, float humidity, float pressure) {
		this.humidity=humidity;
		this.pressure=pressure;
		this.temperature=temperature;
		meaurementsChanged();
	}
}
