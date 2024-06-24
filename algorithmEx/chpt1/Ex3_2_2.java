package algorithmEx.chpt1;

import java.util.Scanner;

public class Ex3_2_2 {
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

        for (int i = 0; i < n / w; i++) {
            System.out.println("*".repeat(w));
        }

        int rest = n % w;
        if (rest != 0) {
            System.out.println("*".repeat(rest));
        }
    }
}
/*
n을 w로 나눈 만큼 반복문을 돈다.
'*'를 한번에 w개만큼 출력하고 줄 바꿈 한다.
    [예) n=17 , w=3 이면 : 반복문은 5번 반복되고, 한번 반복될 때에 '*' 3개를 한번에 출력]

이후 반복문을 빠져나와 n을 w로 나눈 나머지가 0이 아닐때,
나머지 만큼 '*'를 출력

이렇게 하면 반복문을 실행하는 횟수도 줄뿐더러,
if문도 단 한번 실행된다.
 */