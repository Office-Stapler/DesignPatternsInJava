package creational.adaptor;

public class Mazda implements Car {
    private int noOfSeats;
    private int maxSpeed;

    public Mazda(int noOfSeats, int maxSpeed) {
        this.noOfSeats = noOfSeats;
        this.maxSpeed = maxSpeed;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}