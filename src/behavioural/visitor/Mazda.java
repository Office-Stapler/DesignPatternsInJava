package behavioural.visitor;

public class Mazda implements Car {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
