package observer_pattern;

public class main {

	public static void main(String[] args) {
	WeatherData wd= new WeatherData();	
	CurrentWeather currrent=new CurrentWeather(wd);
	wd.setMeasurements(34, 10, 20);
}

}
