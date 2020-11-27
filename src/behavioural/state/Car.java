package behavioural.state;

public class Car {
    private DrivingState state;

    public Car() {
        state = new StoppedState();
    }

    public void drive() {
        state.drive();
        state = state.updateState("drive");
    }

    public void stop() {
        state.stop();
        state = state.updateState("stop");
    }

    public void changeState(DrivingState state) {
        this.state = state;
    }

    public String getStateType() {
        return state.getStateType();
    }
}
