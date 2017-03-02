package observer_pattern_using_java_api;

public class main {

	public static void main(String[] args) {
	WeatherData2 wd= new WeatherData2();	
	CurrentWeather2 currrent=new CurrentWeather2(wd);
	wd.setMeasurements(34, 10, 20);
}

}
