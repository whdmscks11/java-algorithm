package algorithmEx.chpt1;

public class Ex4_2_1 {
    public static void main(String[] args) {
        // 입력한 수(n)을 한변의 길이('*'의 개수)로 하는 정사각형을 만드시오
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

