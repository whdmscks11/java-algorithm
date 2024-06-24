package factoryPatt;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee(CoffeeType.ESPRESSO);
        System.out.println(coffee.getName());
    }
}
