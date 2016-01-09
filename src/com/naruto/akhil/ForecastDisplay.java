package com.naruto.akhil;


public class ForecastDisplay implements Observer , DisplayElement {
    private final WeatherData weatherData;
    private float pressure;
    private float humidity;
    private float temp;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp
                + "F degrees and"  + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
          this.temp = temp;
          this.humidity = humidity;
          this.pressure = pressure;
    }
}
