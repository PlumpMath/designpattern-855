package headfirst.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by studyz on 2016/6/30.
 */
public class PressureObserver implements Observer,Notifyable {

    WeatherData weatherData;

    float pressure ;

    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData)o;
        pressure = weatherData.getPressure();
        notifyAction();
    }

    public PressureObserver(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void notifyAction() {
        System.out.println("PressureObserver: humidity is " + pressure);
    }
}
