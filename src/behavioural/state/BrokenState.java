package behavioural.state;

public class BrokenState implements DrivingState {

    @Override
    public void drive() {
        System.out.println("Can not start moving, car is currently broken");
    }

    @Override
    public DrivingState updateState(String action) {
        return this;
    }

    @Override
    public void stop() {
        System.out.println("Car is broken, already stopped");
    }

    @Override
    public String getStateType() {
        return "broken";
    }
}
