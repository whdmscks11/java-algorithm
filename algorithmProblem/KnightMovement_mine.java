package algorithmProblem;

import java.util.Scanner;

public class KnightMovement_mine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initXY = scanner.nextLine();

        char initColumn = initXY.charAt(0);
        char initRow = initXY.charAt(1);

        char[] columns = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] rows = {'1','2','3','4','5','6','7','8'};

        int[][] moves = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};

        int count = 0;
        for (int[] move : moves) {
            int moveRow = move[1];
            int moveColumn = move[0];

            char movedX = (char)(initRow + moveRow);
            char movedY = (char)(initColumn + moveColumn);

            if (include(movedY, columns) && include(movedX, rows)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean include(char value, char[] charArr) {
        for (char c : charArr) {
            if (c == value) {
                return true;
            }
        }
        return false;
    }
}
