package creational.abstractfactory;

public class AppleFactory implements ElectronicFactory {

    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new Mac();
    }

    @Override
    public Tablet createTablet() {
        return new IPad();
    }
    
}
