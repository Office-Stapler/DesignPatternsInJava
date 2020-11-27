package behavioural.strategy;

public class CarBehaviour implements DriveBehaviour {
    @Override
    public void drive() {
        System.out.println("Car is driving at 50 km/hr");
    }
}
