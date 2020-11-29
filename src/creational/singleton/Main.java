package creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonObject single = SingletonObject.getInstance();
        System.out.println(single.getCalls());
        SingletonObject.getInstance();
        System.out.println(single.getCalls());
    }
}
