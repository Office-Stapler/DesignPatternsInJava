package creational.adaptor;

public class Main {
    public static void main(String[] args) {
        Car mazda = new Mazda(4, 200);
        System.out.println(mazda.getMaxSpeed());
        System.out.println(mazda.getNoOfSeats());

        Horse horse = new Horse(50);
        HorseToCarAdapter adapter = new HorseToCarAdapter(horse);
        System.out.println(adapter.getMaxSpeed());
        System.out.println(adapter.getNoOfSeats());
    }
}
