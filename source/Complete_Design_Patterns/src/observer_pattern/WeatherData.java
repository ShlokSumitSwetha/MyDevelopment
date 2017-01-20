package observer_pattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers=new ArrayList<Observer>();
	private float temp;
	private float pressure;
	private float humidity;

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		int i=observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
		
	}

	@Override
	public void notifyObservers() {
		for(int i=0;i<observers.size();i++){
			Observer observer=(Observer)observers.get(i);
			observer.update(temp, pressure, humidity);
		}
		
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float pressure, float humidity){
		this.humidity=humidity;
		this.pressure=pressure;
		this.temp=temp;
		measurementsChanged();
	}
}