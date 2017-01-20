package observer_pattern_using_java_api;

import java.util.Observable;
import java.util.Observer;

public class CurrentWeather2 implements Observer{
	private float temp;
	private float pressure;
	private float humidity;
	private Observable observable;
	
	public CurrentWeather2(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
	}
	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData2){
			WeatherData2 wd=(WeatherData2)obs;
			this.humidity=wd.getHumidity();
			this.temp=wd.getTemp();
			display();
		}
		
	}
	public void display(){
		System.out.println("weather details"+temp+pressure);
	}
	

	
	
}
