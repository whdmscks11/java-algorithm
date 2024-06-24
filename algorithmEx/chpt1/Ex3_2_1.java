package algorithmEx.chpt1;

import java.util.Scanner;

public class Ex3_2_1 {
    public static void main(String[] args) {
        // '*'를 n개 출력하는데, w개 마다 줄 바꿈

        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("양의 정수 n값 :");
            n = sc.nextInt();
        } while (n <= 0);

        int w;
        do {
            System.out.print("양의 정수 w값 :");
            w = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            if (i % w == 0) {
                System.out.println();
            }
        }
    }
}
/*
위 코드는 for문을 반복할 때마다 if문을 실행하므로 효율적이지 않다.
 */