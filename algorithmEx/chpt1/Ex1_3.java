package algorithmEx.chpt1;

import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {
        // 1 부터 n 까지의 합을 구하는데, 이때 n 값으로 양숫값만 받아야 한다.

        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("n값 : ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
