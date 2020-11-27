package behavioral.state;

public class MovingState implements DrivingState {

    @Override
    public void drive() {
        System.out.println("Car is already moving.");
    }

    @Override
    public DrivingState updateState(String action) {
        if ("drive".equals(action))
            return this;
        return new StoppedState();
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car.");
    }

    @Override
    public String getStateType() {
        return "moving";
    }
    
}