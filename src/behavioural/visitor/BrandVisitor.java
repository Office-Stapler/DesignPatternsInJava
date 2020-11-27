package behavioural.visitor;

public class BrandVisitor implements Visitor {

    @Override
    public void visit(Mazda mazda) {
        System.out.println("Brand is Mazda");
    }

    @Override
    public void visit(Volkswagen vw) {
        System.out.println("Brand is Volkswagen");
    }

    @Override
    public void visit(Honda honda) {
        System.out.println("Brand is Honda");
    }
}
