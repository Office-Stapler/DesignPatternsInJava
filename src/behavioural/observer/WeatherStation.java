package behavioural.observer;

import java.util.ArrayList;

public class WeatherStation implements Subject {
    private ArrayList<Observer> observers;
    private double temperature;
    private double humidity;
    private double wind;

    public WeatherStation(double temperature, double humidity, double wind) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
        observers = new ArrayList<>();
    }


    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public double getwind() {
        return wind;
    }

    public void setWind(double wind) {
        this.wind = wind;
        notifyObservers();
    }
    
}
