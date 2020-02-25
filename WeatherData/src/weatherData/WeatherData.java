package weatherData;
import java.util.ArrayList;

public class WeatherData implements Subject{
	protected ArrayList<Observer> _observers;
	protected float _temp;
	protected float _hum;
	protected float _pre;
	
	public WeatherData() {
		_observers = new ArrayList<Observer>();
	}
	public void registerObserver(Observer obj) {
		_observers.add(obj);
	}
	public void removeObserver(Observer obj) {
		if(obj != null)
			_observers.remove(obj);
	}
	public void notifyObservers() {	
		for(Observer _observer : _observers) {
			_observer.update(_temp, _hum, _pre);
		}
	}
	
	public float getTemperature() {
		return _temp;
	}
	
	public float getHumidity() {
		return _hum;
	}
	
	public float getPressure() {
		return _pre;
	}
	
	public void measurementChanged() {
		notifyObservers();
	}
	//setMeasurement method is used to set values
	public void setMeasurement(float temp, float hum, float pre) {
		_temp = temp;
		_hum = hum;
		_pre = pre;
		measurementChanged();
	}
}
