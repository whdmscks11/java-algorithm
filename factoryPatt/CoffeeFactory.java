package factoryPatt;

public class CoffeeFactory {
    public static Coffee createCoffee(CoffeeType type) {
        Coffee coffee = switch (type) {
            case LATTE -> new Latte();
            case ESPRESSO -> new Espresso();
            default -> null;
        };
        return coffee;
    }
}
