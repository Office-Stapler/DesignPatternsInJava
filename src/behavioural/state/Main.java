package behavioural.state;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.stop();
        car.drive();
        car.drive();
        car.stop();

        System.out.println(car.getStateType());

        car.changeState(new BrokenState());
        car.drive();
        car.stop();

        System.out.println(car.getStateType());
    }
}
