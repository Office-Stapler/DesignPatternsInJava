package creational.factorymethod;

public class PenguinHome extends BirdHome {
    public Bird createBird() {
        return new Penguin();
    }
}
