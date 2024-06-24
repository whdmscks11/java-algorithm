package algorithmProblem;

import java.util.Scanner;

public class TravelPlan_AI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N 입력 받기
        int N = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 문자 제거

        // 이동 계획서 입력 받기
        String plans = scanner.nextLine();

        // 초기 위치 설정
        int x = 1;
        int y = 1;

        // 이동 방향에 따른 변화량
        int[] dx = {0, 0, -1, 1}; // L, R, U, D에 대응하는 x 변화량
        int[] dy = {-1, 1, 0, 0}; // L, R, U, D에 대응하는 y 변화량
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        // 이동 계획을 하나씩 처리
        for (String plan : plans.split(" ")) {  // 이 루프는 M번 반복됩니다.
            // 이동 후 좌표 계산
            int nx = x;
            int ny = y;
            for (int i = 0; i < moveTypes.length; i++) { // 이 루프는 항상 4번 반복됩니다.
                if (plan.charAt(0) == moveTypes[i]) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                }
            }

            // 경계를 벗어나면 무시
            if (nx < 1 || ny < 1 || nx > N || ny > N) continue;

            // 위치 이동
            x = nx;
            y = ny;
        }

        // 최종 위치 출력
        System.out.println(x + " " + y);
    }
}
