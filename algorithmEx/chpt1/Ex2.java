package algorithmEx.chpt1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하시오
            // 출력 예시 : "그 수는 4자리입니다."
        Scanner sc = new Scanner(System.in);


        int num;
        do {
            System.out.print("양의 정수를 입력하세요 : ");
            num = sc.nextInt();
        } while (num <= 0);

        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }

        System.out.println("그 수는 " + count + "자리입니다.");
    }
}
