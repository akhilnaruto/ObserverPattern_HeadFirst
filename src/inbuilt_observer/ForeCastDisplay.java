package inbuilt_observer;

import java.util.Observable;
import java.util.Observer;

public class ForeCastDisplay implements Observer,DisplayElement {
    private final Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public ForeCastDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("forecast  Display: " + temperature
                + "F degrees and"  + humidity + "% humidity");
    }
}
