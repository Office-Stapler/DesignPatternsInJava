package creational.decorator;

public class CreamDecorator extends ToppingDecorator {

    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + whipped cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;
    }
    
}
