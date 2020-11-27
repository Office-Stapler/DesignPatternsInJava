package behavioural.visitor;

public class Honda implements Car {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
