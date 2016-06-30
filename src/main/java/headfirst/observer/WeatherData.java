package headfirst.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.function.Consumer;

/**
 * Created by studyz on 2016/6/30.
 */
public class WeatherData extends Observable {

    float temp;
    float humidity;
    float pressure;

    public WeatherData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    List<Observer> observers = new ArrayList<Observer>();

    public void measuermentsChanged(){
        setChanged();
        notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
        measuermentsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        measuermentsChanged();
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        measuermentsChanged();
    }
}
