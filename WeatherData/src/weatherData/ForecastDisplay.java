package weatherData;

public class ForecastDisplay implements Observer, DisplayElement {
	private float lastTemp = 0;
	private float currentTemp;
	private Subject _sub;
	
	//Constructor to register the observer to the subject
	public ForecastDisplay(Subject sub) {
		this._sub = sub;
		_sub.registerObserver(this);
	}
	
	public void update(float temp, float hum, float pre) {
		lastTemp = currentTemp;
		currentTemp = temp;
		display();
	}
	
	public void display() {
		System.out.println("This is the forecast display:");
		if(currentTemp > lastTemp)
			System.out.println("The weather will become warmer.\n");
		else if(currentTemp < lastTemp)
			System.out.println("The weather will become cooler.\n");
		else
			System.out.println("The tempreature will stay the same.\n");
	}
}
