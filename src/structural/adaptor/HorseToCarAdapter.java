package creational.adaptor;

public class HorseToCarAdapter implements Car {
    Horse horse;
    public HorseToCarAdapter(Horse horse) {
        this.horse = horse;
    }
    @Override
    public int getMaxSpeed() {
        return horse.getMaxSpeed();
    }

    @Override
    public int getNoOfSeats() {
        return 1;
    }
}
