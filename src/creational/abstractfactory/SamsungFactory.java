package creational.abstractfactory;

public class SamsungFactory implements ElectronicFactory {

    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }

    @Override
    public Tablet createTablet() {
        return new SamsungTablet();
    }
    
}
