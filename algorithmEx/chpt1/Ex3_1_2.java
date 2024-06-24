package algorithmEx.chpt1;

public class Ex3_1_2 {
    public static void main(String[] args) {
        // '+' 와 '-'를 번갈아 n개 출력하는 프로그램 작성

        int n = 11;

        for (int i = 1; i <= n / 2; i++) {
            System.out.print("+-");
        }
        if (n % 2 != 0) {
            System.out.print("+");
        }
    }
}