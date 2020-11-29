package creational.builder;

public interface PhoneBuilder {
    public void buildCPU();
    public void buildRAM();
    public void buildBattery();
    public void reset();
    public Phone getPhone();
}
