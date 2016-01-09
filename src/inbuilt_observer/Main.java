package inbuilt_observer;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForeCastDisplay foreCastDisplay  = new ForeCastDisplay(weatherData);
        weatherData.setMeasurements(10,11,12);
    }
}
