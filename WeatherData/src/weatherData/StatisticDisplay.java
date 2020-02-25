package weatherData;

public class StatisticDisplay implements Observer, DisplayElement {
	private float max_temp = -100000;
	private float min_temp = 100000;
	private float tempSum = 0;
	private float times = 0;
	private Subject _sub;
	
	//Constructor to register the observer to the subject
	public StatisticDisplay(Subject sub) {
		this._sub = sub;
		_sub.registerObserver(this);
	}
	
	public void update(float temp, float hum, float pre) {
		tempSum += temp;
		times++;
		if(temp > max_temp)
			max_temp = temp;
		if(temp < min_temp)
			min_temp = temp;
		display();
	}
	
	public void display() {
		System.out.println("This is the statistic display:");
		System.out.println("Average temperature: " + tempSum/times);
		System.out.println("Max temperature: " + max_temp);
		System.out.println("Min temperature: " + min_temp + "\n");
	}
}
