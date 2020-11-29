package creational.abstractfactory;

public class IPhone implements Phone {

    @Override
    public String getManufacturer() {
        return "Apple";
    }

    @Override
    public String getType() {
        return "iPhone";
    }
    
}
