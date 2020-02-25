package weatherData;

public interface Subject {
	
	public void registerObserver(Observer obj);
	public void removeObserver(Observer obj);
	public void notifyObservers();
}
