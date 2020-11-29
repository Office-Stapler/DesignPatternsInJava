package creational.abstractfactory;

public class SamsungLaptop implements Laptop {

    @Override
    public String getManufacturer() {
        return "Samsung";
    }

    @Override
    public String getType() {
        return "Laptop";
    }
    
}
