package behavioral.observer;

public class WindowDisplay implements Display {
    private double temperature;
    private double humidity;
    private double wind;

    public WindowDisplay(double temperature, double humidity, double wind) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
    }
    @Override
    public void display() {
        System.out.println(
            String.format("\nWindow Display\nTemperature: %.2f\nHumidity: %.2f\nWind Speed: %.2f",
            temperature, humidity, wind)
        );
    }

    @Override
    public void update(WeatherStation station) {
        temperature = station.getTemperature();
        humidity = station.getHumidity();
        wind = station.getwind();
    }
}
