package strategyPatt;

import java.time.LocalDate;

public class ShoppingMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item A = new Item("라면", 1200);
        Item B = new Item("김치", 2400);
        Item C = new Item("치즈", 1000);

        shoppingCart.addItem(A);
        shoppingCart.addItem(B);
        shoppingCart.addItem(C);
        shoppingCart.showItems();
        System.out.println();

        shoppingCart.removeItem(C);
        shoppingCart.showItems();
        System.out.println();

        // KAKAO Card 결제
        shoppingCart.pay(new KakaoCard("조은찬", "9490-0550-0122-1010", "032", "12/28"));
        System.out.println();

        // LUNA Card 결제
        shoppingCart.pay(new LunaCard("whdmscks11@gmail.com", "iljhi143!@"));

    }
}
