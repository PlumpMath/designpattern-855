package headfirst.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by studyz on 2016/6/30.
 */
public class HumidityObserver implements Observer,Notifyable {

    WeatherData weatherData;

    float humidity ;

    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData)o;
        humidity = weatherData.getHumidity();
        notifyAction();
    }

    public HumidityObserver(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void notifyAction() {
        System.out.println("HumidityObserver: humidity is " + humidity);
    }

}
