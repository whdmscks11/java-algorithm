package factoryPatt;

public abstract class Coffee {
    protected String name;

    public String getName(){
        return name;
    }
}

class Latte extends Coffee{
    public Latte() {
        name = "Latte";
    }
}

class Espresso extends Coffee{
    public Espresso() {
        name = "Espresso";
    }
}
