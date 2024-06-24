package algorithmEx.chpt1;

public class Ex4_2_3 {
    public static void main(String[] args) {
        // 직각 이등변 삼각형을 출력하는 부분을 메서드로 추출하여 프로그램을 작성하시오
        triangleLB(5);

        triangleLU(5);

        triangleRB(5);

        triangleRU(5);
    }

    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
        System.out.println();
    }

    static void triangleLU(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println("*".repeat(i));
        }
        System.out.println();
    }

    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n-i));
            System.out.print("*".repeat(i));
            System.out.println();
        }
        System.out.println();
    }

    static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(i));
            System.out.print("*".repeat(n-i));
            System.out.println();
        }
        System.out.println();
    }
}

