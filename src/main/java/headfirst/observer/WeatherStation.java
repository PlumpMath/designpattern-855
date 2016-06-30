package headfirst.observer;

/**
 * Created by studyz on 2016/6/30.
 */
public class WeatherStation {


    public static void main(String[] args){
        WeatherData weatherData = new WeatherData(11.2f,132.2f,231.42f);

        TempObserver tempObserver = new TempObserver(weatherData);

        HumidityObserver humidityObserver = new HumidityObserver(weatherData);

        PressureObserver pressureObserver = new PressureObserver(weatherData);

        weatherData.addObserver(tempObserver);
        weatherData.addObserver(humidityObserver);
        weatherData.addObserver(pressureObserver);

        weatherData.setHumidity(12.1f);
        weatherData.setPressure(13.2f);
        weatherData.setTemp(15.2f);

    }



}
