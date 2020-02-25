package weatherData;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create subject
		Subject weatherData = new WeatherData();
		//Create observers one by one
		//Display the current weather data
		Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		//Display the maximum, minimum and average temperature
		Observer statisticDisplay = new StatisticDisplay(weatherData);
		//Display the forecast for the weather based on the temperature data
		Observer forecastDisplay = new ForecastDisplay(weatherData);
		//Display the humidity report based on the humidity data
		Observer thirdPartyDisplay = new ThirdPartyDisplay(weatherData);
		
		//Set values for the observers
		((WeatherData) weatherData).setMeasurement(80, 55, 101);
		((WeatherData) weatherData).setMeasurement(82, 62, 102);
		
		//Remove Observers one by one
		weatherData.removeObserver(thirdPartyDisplay);
		weatherData.notifyObservers();
		weatherData.removeObserver(forecastDisplay);
		weatherData.notifyObservers();
		weatherData.removeObserver(statisticDisplay);
		weatherData.notifyObservers();
		weatherData.removeObserver(currentConditionDisplay);
		weatherData.notifyObservers();
	}

}
