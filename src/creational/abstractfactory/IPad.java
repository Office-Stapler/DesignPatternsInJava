package creational.abstractfactory;

public class IPad implements Tablet {

    @Override
    public String getManufacturer() {
        return "Apple";
    }

    @Override
    public String getType() {
        return "iPad";
    }
    
}
