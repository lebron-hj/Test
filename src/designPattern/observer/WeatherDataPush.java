package designPattern.observer;

import java.util.Observable;

/**
 * jdk自带观察者模式测试：推式
 * 
 * @author hj
 *
 */
public class WeatherDataPush extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public void meaurementsChanged() {
		setChanged();
		float[] obj = { temperature, humidity, pressure };
		notifyObservers(obj);
	}

	public void setMeaurements(float temperature, float humidity, float pressure) {
		this.humidity=humidity;
		this.pressure=pressure;
		this.temperature=temperature;
		meaurementsChanged();
	}
}
