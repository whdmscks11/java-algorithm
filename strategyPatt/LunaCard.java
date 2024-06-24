package strategyPatt;

public class LunaCard implements PaymentStrategy{
    private String email;
    private String password;

    public LunaCard(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using LUNA Card");
    }
}
