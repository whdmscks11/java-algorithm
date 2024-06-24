package algorithmEx.chpt2;

public class Ex3 {
    public static void main(String[] args) {
        // 입력받은 수 n 이하의 모든 소수를 출력하는 프로그램
        printPrimeUnder(30);
    }

    public static boolean isPrimeNo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeUnder(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrimeNo(i)) {
                System.out.println(i);
            }
        }
    }
}