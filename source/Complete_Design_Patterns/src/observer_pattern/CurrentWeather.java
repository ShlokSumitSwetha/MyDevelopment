package observer_pattern;

public class CurrentWeather implements Observer,DisplayElement{
	private float temp;
	private float pressure;
	private float humidity;
	private Subject weatherData;
	
	public CurrentWeather(Subject weatherData){
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.humidity=humidity;
		this.pressure=pressure;
		this.temp=temp;
		display();
	
	}

	public void display(){
		System.out.println("weather details"+temp+pressure);
	}
}
