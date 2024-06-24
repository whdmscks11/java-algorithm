package algorithmEx.chpt1;

public class Ex4_2_4 {
    public static void main(String[] args) {
        // 피라미드
        pyramid(5);
    }
    static void pyramid(int n){
        for (int i = 1; i <= n; i++) {

            System.out.print(" ".repeat(n - i));

            // System.out.print("*".repeat((2*i)-1));
            String strVal = String.valueOf(i);
            System.out.print(strVal.repeat((2*i)-1));

            System.out.println();
        }
    }

}

