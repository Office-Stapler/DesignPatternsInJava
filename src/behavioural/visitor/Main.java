package behavioural.visitor;

public class Main {
    public static void main(String[] args) {
        Car mazda = new Mazda();
        Car honda = new Honda();
        Car vw = new Volkswagen();

        BrandVisitor bvisit = new BrandVisitor();
        CostMultiplierVisitor cvisit = new CostMultiplierVisitor();

        mazda.accept(bvisit);
        mazda.accept(cvisit);

        honda.accept(bvisit);
        honda.accept(cvisit);

        vw.accept(bvisit);
        vw.accept(cvisit);
    }
}
