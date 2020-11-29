package creational.singleton;

public class SingletonObject {
    // Number of times a function mentions this instance
    private int calls;
    private static SingletonObject object = null;
    private SingletonObject() {
        calls = 0;
    }

    public void incrementCall() {
        calls++;
    }
    
    public int getCalls() {
        return calls;
    }

    public static SingletonObject getInstance() {
        if (object == null) {
            object = new SingletonObject();
        }
        object.incrementCall();
        return object;
    }
}
