package creational.factorymethod;

public abstract class BirdHome {
    public abstract Bird createBird();
    public void describeHome() {
        Bird bird = createBird();
        bird.describe();
    }

    public void fly() {
        Bird bird = createBird();
        bird.fly();
    }
}
