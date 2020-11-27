package behavioral.strategy;

public class BusBehaviour implements DriveBehaviour {
    @Override
    public void drive() {
        System.out.println("Bus is driving at 40 km/hr");
    }
}
