package creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        BirdHome penguinHome = new PenguinHome();
        penguinHome.describeHome();
        penguinHome.fly();

        BirdHome pigeonNest = new PigeonNest();
        pigeonNest.describeHome();
        pigeonNest.fly();
    }
}
