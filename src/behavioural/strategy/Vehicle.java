package behavioural.strategy;

public class Vehicle {
    private DriveBehaviour drive;

    public Vehicle(DriveBehaviour drive) {
        this.drive = drive;
    }

    public void drive() {
        drive.drive();
    }
}
