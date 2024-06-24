package strategyPatt;

public class KakaoCard implements PaymentStrategy{

    private String name;
    private String cardNum;
    private String cvv;
    private String expireDate;

    public KakaoCard(String name, String cardNum, String cvv, String expireDate) {
        this.name = name;
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.expireDate = expireDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using KAKAO Card");
    }
}
