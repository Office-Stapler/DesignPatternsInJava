package creational.factorymethod;

public class PigeonNest extends BirdHome {
    @Override
    public Bird createBird() {
        return new Pigeon();
    }
    
}