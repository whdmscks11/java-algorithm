package strategyPatt;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> list;

    public ShoppingCart() {
        this.list = new ArrayList<>();
    }

    public void addItem(Item item){
        System.out.println("\"" + item.getName() + "\" 장바구니에 추가");
        list.add(item);
    }

    public void removeItem(Item item) {
        System.out.println("\"" + item.getName() + "\" 장바구니에서 제거");
        list.remove(item);
    }

    public void showItems(){
        System.out.println("== 장바구니 목록 ==");
        for (Item item : list) {
            System.out.println("- " + item.getName());
        }
    }

    private int calculateTotal(){
        int total = 0;
        for (Item item : list) {
            total += item.getPrice();;
        }
        return total;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
