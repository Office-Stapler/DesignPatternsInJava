package creational.factorymethod;

public class Pigeon implements Bird {

    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }

    @Override
    public void describe() {
        System.out.println("This bird is a pigeon");
    }
    
}
