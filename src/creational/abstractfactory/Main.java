package creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        ElectronicFactory appleFactory = new AppleFactory();
        Phone iphone = appleFactory.createPhone();
        Tablet ipad = appleFactory.createTablet();
        Laptop mac = appleFactory.createLaptop();

        System.out.println(iphone.getManufacturer());
        System.out.println(iphone.getType());

        System.out.println(ipad.getManufacturer());
        System.out.println(ipad.getType());

        System.out.println(mac.getManufacturer());
        System.out.println(mac.getType());

        ElectronicFactory samsungFactory = new SamsungFactory();
        Phone galaxy = samsungFactory.createPhone();
        Tablet tablet = samsungFactory.createTablet();
        Laptop laptop = samsungFactory.createLaptop();

        System.out.println(galaxy.getManufacturer());
        System.out.println(galaxy.getType());

        System.out.println(tablet.getManufacturer());
        System.out.println(tablet.getType());

        System.out.println(laptop.getManufacturer());
        System.out.println(laptop.getType());
        
    } 
}
