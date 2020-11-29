package creational.abstractfactory;

public class Mac implements Laptop {

    @Override
    public String getManufacturer() {
        return "Apple";
    }

    @Override
    public String getType() {
        return "Macbook";
    }
    
}
