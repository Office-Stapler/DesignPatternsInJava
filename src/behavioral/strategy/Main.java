package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Vehicle bus = new Vehicle(new BusBehaviour());
        Vehicle car = new Vehicle(new CarBehaviour());
        Vehicle jet = new Vehicle(new JetBehaviour());

        bus.drive();
        car.drive();
        jet.drive();
    }
}
