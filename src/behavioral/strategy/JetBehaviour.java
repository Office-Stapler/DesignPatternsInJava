package behavioral.strategy;

public class JetBehaviour implements DriveBehaviour {
    @Override
    public void drive() {
        System.out.println("Jet is flying at 1000 km/hr");
    }
}
