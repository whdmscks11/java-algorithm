package algorithmProblem;

import java.time.LocalTime;
import java.util.Scanner;

public class TimeCountThree_AI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int hour = 0; hour <= n; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    if (containsThree(hour) || containsThree(minute) || containsThree(second)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    // 해당 숫자에 3이 포함되어 있는지 확인하는 함수
    private static boolean containsThree(int num) {
        return String.valueOf(num).contains("3");
    }
}
