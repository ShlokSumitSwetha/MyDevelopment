package observer_pattern_using_java_api;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData2 extends Observable{
	
	private float temp;
	private float pressure;
	private float humidity;

	

	
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float pressure, float humidity){
		this.humidity=humidity;
		this.pressure=pressure;
		this.temp=temp;
		measurementsChanged();
	}
	/**
	 * @return the temp
	 */
	public float getTemp() {
		return temp;
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}
}