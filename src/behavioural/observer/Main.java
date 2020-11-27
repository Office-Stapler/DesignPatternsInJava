package behavioural.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation(10, 0.5, 19);
        Observer phoneObserver = new PhoneDisplay(10, 0.5, 19);
        Observer windowObserver = new WindowDisplay(10, 0.5, 19);
        station.add(phoneObserver);
        station.add(windowObserver);

        station.setHumidity(0.2);
        station.setTemperature(22.5);
        station.setWind(18.5);
        
        Display phoneDisplay = (Display) phoneObserver;
        Display windowDisplay = (Display) windowObserver;

        phoneDisplay.display();
        windowDisplay.display();
    }
}
