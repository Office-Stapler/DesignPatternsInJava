package creational.abstractfactory;

public class SamsungPhone implements Phone {

    @Override
    public String getManufacturer() {
        return "Samsung";
    }

    @Override
    public String getType() {
        return "Smartphone";
    }
    
}
