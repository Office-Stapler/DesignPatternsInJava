package creational.builder;

public interface PhoneBluePrint {
    public void setCPU(String cpu);
    public void setManufacturer(String manufacturer);
    public void setName(String name);
    public void setRAM(String RAM);
    public void setBatteryLife(int baterryLife);
}
