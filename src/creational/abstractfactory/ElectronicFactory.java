package creational.abstractfactory;

public interface ElectronicFactory {
    public Phone createPhone();
    public Laptop createLaptop();
    public Tablet createTablet();
}
