package behavioural.observer;

public class PhoneDisplay implements Display {

    private double temperature;
    private double humidity;
    private double wind;

    public PhoneDisplay(double temperature, double humidity, double wind) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
    }
    
    @Override
    public void update(WeatherStation station) {
        temperature = station.getTemperature();
        humidity = station.getHumidity();
        wind = station.getwind();
    }

    @Override
    public void display() {
        System.out.println(
            String.format("\nPhone Display\nTemperature: %.2f\nHumidity: %.2f\nWind Speed: %.2f",
            temperature, humidity, wind)
        );
    }
}
