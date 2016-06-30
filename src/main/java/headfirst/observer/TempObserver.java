package headfirst.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by studyz on 2016/6/30.
 */
public class TempObserver implements Observer,Notifyable {

    WeatherData weatherData;

    float temp ;

    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData)o;
        temp = weatherData.getTemp();
        notifyAction();
    }

    public TempObserver(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void notifyAction() {
        System.out.println("TempObserver: temp is " + temp);
    }
}
