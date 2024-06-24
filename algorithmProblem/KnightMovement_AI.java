package algorithmProblem;

import java.util.Scanner;

public class KnightMovement_AI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 현재 나이트의 위치 입력 받기
        String position = scanner.next();
        int row = position.charAt(1) - '0'; // 행 번호
        int col = position.charAt(0) - 'a' + 1; // 열 번호

        // 나이트가 이동할 수 있는 8가지 경우의 수
        int[][] moves = {
                {-2, -1}, {-1, -2}, {1, -2}, {2, -1},
                {2, 1}, {1, 2}, {-1, 2}, {-2, 1}
        };

        // 이동 가능한 경우의 수 카운트
        int count = 0;
        for (int[] move : moves) {
            int nr = row + move[0];
            int nc = col + move[1];
            if (nr >= 1 && nr <= 8 && nc >= 1 && nc <= 8) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
