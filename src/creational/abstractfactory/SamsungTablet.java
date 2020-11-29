package creational.abstractfactory;

public class SamsungTablet implements Tablet {

    @Override
    public String getManufacturer() {
        return "Samsung";
    }

    @Override
    public String getType() {
        return "Tablet";
    }
    
}
