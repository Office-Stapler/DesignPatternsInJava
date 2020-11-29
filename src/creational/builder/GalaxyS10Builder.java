package creational.builder;

public class GalaxyS10Builder implements PhoneBuilder {
    private Phone phone = new Phone();
    public GalaxyS10Builder() {
        phone.setName("Galaxy S10");
        phone.setManufacturer("Samsung");
    }

    @Override
    public void buildCPU() {
        phone.setCPU("Octa-core chipset");
    }

    @Override
    public void buildRAM() {
        phone.setRAM("8GB");
    }

    @Override
    public void buildBattery() {
        phone.setBatteryLife(3400);
    }

    @Override
    public void reset() {
        phone = new Phone();
        phone.setName("Galaxy S10");
        phone.setManufacturer("Samsung");
    }

    @Override
    public Phone getPhone() {
        return phone;
    }
}
