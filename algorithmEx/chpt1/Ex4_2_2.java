package algorithmEx.chpt1;

public class Ex4_2_2 {
    public static void main(String[] args) {
        // 직각 이등변 삼각형 만들기
        int n = 5;

        // 방법 1
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(i+1));
        }

        // 방법2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

