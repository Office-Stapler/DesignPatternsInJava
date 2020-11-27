package behavioural.visitor;

public class Volkswagen implements Car {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
