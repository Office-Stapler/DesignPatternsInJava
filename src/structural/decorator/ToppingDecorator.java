package creational.decorator;

public abstract class ToppingDecorator implements Coffee {
    protected Coffee coffee;
    public ToppingDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
