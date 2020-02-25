package weatherData;

public class ThirdPartyDisplay implements Observer, DisplayElement{
	private float _hum;
	private static final float HUM_LEVEL1 = 50;//50% - 60% is standard humidity for most of mankind.
	private static final float HUM_LEVEL2 = 60;
	private Subject _sub;
	
	//Constructor to register the observer to the subject
	public ThirdPartyDisplay(Subject sub) {
		this._sub = sub;
		_sub.registerObserver(this);
	}
	
	public void update(float temp, float hum, float pre) {
		_hum = hum;
		display();
	}
	
	public void display() {
		System.out.println("This is the third party display:");
		if(_hum < HUM_LEVEL1)
			System.out.println("The weather is kind of arid.\n ");
		else if(_hum > HUM_LEVEL2)
			System.out.println("The weather is kind of mosit.\n ");
		else
			System.out.println("The weather is cozy.\n ");
	}
}
