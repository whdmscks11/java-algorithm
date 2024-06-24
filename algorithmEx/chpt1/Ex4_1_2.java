package algorithmEx.chpt1;

public class Ex4_1_2 {
    public static void main(String[] args) {
        // 덧셈표 (위쪽(가로) 1-9 , 왼쪽(세로) 1-9)
        System.out.println("  |  1  2  3  4  5  6  7  8  9");
        System.out.println("--+---------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }
}
