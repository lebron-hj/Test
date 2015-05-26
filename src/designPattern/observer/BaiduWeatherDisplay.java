package designPattern.observer;

import java.util.Observable;
import java.util.Observer;

public class BaiduWeatherDisplay implements Observer {
	
	WeatherDataPush subject1;
	WeatherDataPull subject2;
	

	public BaiduWeatherDisplay(WeatherDataPush subject1) {
		this.subject1=subject1;
		subject1.addObserver(this);
	}
	public BaiduWeatherDisplay(WeatherDataPull subject2) {
		this.subject2=subject2;
		subject2.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (subject2==null) {
			System.out.println("subject1==o:"+(subject1==o));
			float[] f = (float[])arg;
			System.out.println("百度天气:温度"+f[0]+"，湿度"+f[1]+"，气压"+f[2]);
		} else {
			System.out.println("subject2==o:"+(subject2==o));
			WeatherDataPull s = (WeatherDataPull)o;
			System.out.println("百度天气:温度"+s.getTemperature()+"，湿度"+s.getHumidity()+"，气压"+s.getPressure());
		}
	}

}
