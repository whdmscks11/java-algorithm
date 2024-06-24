package algorithmProblem;

import java.time.LocalTime;
import java.util.Scanner;

public class TimeCountThree_mine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        LocalTime myTime = LocalTime.of(0, 0, 0);
        LocalTime endTime = LocalTime.of(n, 59, 59);

        while (myTime.isBefore(endTime)) {
            myTime = myTime.plusSeconds(1);
            String string = myTime.toString();
            if (string.contains("3")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
