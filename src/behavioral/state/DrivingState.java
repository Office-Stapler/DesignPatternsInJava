package behavioral.state;

public interface DrivingState {
    public void drive();
    public void stop();
    public DrivingState updateState(String action);
    public String getStateType();
}
