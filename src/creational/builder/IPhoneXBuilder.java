package creational.builder;

public class IPhoneXBuilder implements PhoneBuilder {
    private Phone phone = new Phone();

    public IPhoneXBuilder() {
        phone.setName("iPhone X");
        phone.setManufacturer("Apple");
    }

    @Override
    public void buildCPU() {
       phone.setCPU("A11 Bionic chip");
    }

    @Override
    public void buildRAM() {
        phone.setRAM("3GB");
    }

    @Override
    public void buildBattery() {
        phone.setBatteryLife(2716);
    }

    @Override
    public void reset() {
        phone = new Phone();
        phone.setName("iPhone X");
        phone.setManufacturer("Apple");
    }

    @Override
    public Phone getPhone() {
        return phone;
    }
    
}
