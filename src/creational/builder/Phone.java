package creational.builder;

public class Phone implements PhoneBluePrint {

    private String cpu;
    private String manufacturer;
    private String name;
    private String RAM;
    private int batteryLife;

    @Override
    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void setName(String name) {
       this.name = name;
    }

    @Override
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public void setBatteryLife(int baterryLife) {
        this.batteryLife = baterryLife;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getRAM() {
        return RAM;
    }

    public int getBatteryLife() {
        return batteryLife;
    }
    
}
