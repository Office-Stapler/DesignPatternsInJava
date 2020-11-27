package behavioural.state;

public class StoppedState implements DrivingState {

    @Override
    public void drive() {
        System.out.println("Car is now moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is already stopped");
    }

    @Override
    public DrivingState updateState(String action) {
        if ("stop".equals(action))
            return this;
        return new MovingState();
    }

    @Override
    public String getStateType() {
        return "stopped";
    }
    
}
