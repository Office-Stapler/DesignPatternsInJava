package creational.builder;

public class PhoneDirector {
    private PhoneBuilder builder;
    
    public PhoneDirector(PhoneBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(PhoneBuilder builder) {
        this.builder = builder;
    }

    public void makePhone() {
        builder.reset();
        builder.buildBattery();
        builder.buildCPU();
        builder.buildRAM();
    }

    public Phone getPhone() {
        return builder.getPhone();
    }

}
