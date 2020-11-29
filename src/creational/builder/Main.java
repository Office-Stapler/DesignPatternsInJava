package creational.builder;

public class Main {
    public static void main(String[] args) {
        GalaxyS10Builder gBuilder = new GalaxyS10Builder();
        IPhoneXBuilder iBuilder = new IPhoneXBuilder();

        PhoneDirector director = new PhoneDirector(gBuilder);
        director.makePhone();
        Phone s10 = director.getPhone();
        System.out.println(s10.getName());
        System.out.println(s10.getManufacturer());
        System.out.println(s10.getCpu());
        System.out.println(s10.getRAM());
        System.out.println(s10.getBatteryLife());

        director.changeBuilder(iBuilder);
        director.makePhone();
        Phone iphone = director.getPhone();
        System.out.println(iphone.getName());
        System.out.println(iphone.getManufacturer());
        System.out.println(iphone.getCpu());
        System.out.println(iphone.getRAM());
        System.out.println(iphone.getBatteryLife());

    }
}
