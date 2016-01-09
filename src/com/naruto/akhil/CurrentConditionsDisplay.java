package com.naruto.akhil;


public class CurrentConditionsDisplay implements Observer , DisplayElement {
    private final Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions Display: " + temperature
                + "F degrees and"  + humidity + "% humidity");
    }


}
