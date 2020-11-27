package behavioural.visitor;

public class CostMultiplierVisitor implements Visitor {

    @Override
    public void visit(Mazda mazda) {
        System.out.println("Cost multiplier of 1.2x");
    }

    @Override
    public void visit(Volkswagen vw) {
        System.out.println("Cost multiplier of 1.15x");
    }

    @Override
    public void visit(Honda honda) {
        System.out.println("Cost multiplier of 1.2x");
    }
}
