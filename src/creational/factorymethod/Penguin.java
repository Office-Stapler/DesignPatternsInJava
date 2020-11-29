package creational.factorymethod;

public class Penguin implements Bird {

    @Override
    public void fly() {
        System.out.println("Penguins can not fly!");
    }

    @Override
    public void describe() {
        System.out.println("This bird is a penguin");
    }
    
}
