package creational.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        Coffee espressoWithCream = new CreamDecorator(espresso);
        Coffee espressoWithCreamAndChocolate = new ChocolateDecorator(espressoWithCream);

        System.out.println(espresso.getDescription());
        System.out.println(espresso.getCost());

        System.out.println(espressoWithCream.getDescription());
        System.out.println(espressoWithCream.getCost());

        System.out.println(espressoWithCreamAndChocolate.getDescription());
        System.out.println(espressoWithCreamAndChocolate.getCost());

    }
}
