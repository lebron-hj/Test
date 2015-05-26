package designPattern.observer;

public class ObserverJDK {
	public static void main(String[] args) {
		WeatherDataPush subject1 = new WeatherDataPush();
		SinaWeatherDisplay observer1 = new SinaWeatherDisplay(subject1);
		BaiduWeatherDisplay observer2 = new BaiduWeatherDisplay(subject1);
		GoogleWeatherDisplay observer3 = new GoogleWeatherDisplay(subject1);
		subject1.setMeaurements(23, 42, 100);
		
	}
}
