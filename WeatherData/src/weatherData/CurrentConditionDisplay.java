package weatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float _temp;
	private float _hum;
	private float _pre;
	private Subject _sub;
	
	//Constructor to register the observer to the subject
	public CurrentConditionDisplay(Subject sub) {
		this._sub = sub;
		_sub.registerObserver(this);
	}
	
	public void update(float temp, float hum, float pre) {
		this._temp = temp;
		this._hum = hum;
		this._pre = pre;
		display();
	}
	
	public void display() {
		System.out.println("This is the Current condition display:");
		System.out.println(_temp + " F degrees");
		System.out.println(_hum + " % humidity");
		System.out.println(_pre + " kPa\n");
	}
}
