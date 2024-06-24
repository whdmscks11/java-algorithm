package algorithmProblem;

import java.util.Scanner;

public class TravelPlan_mine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int initCountX = 1;
        int initCountY = 1;

        int UserX = initCountX;
        int UserY = initCountY;

        scanner.nextLine();
        String move = scanner.nextLine();
        String[] strArr = move.split(" ");

        for (String s : strArr) {
            switch (s) {
                case "R":
                    if (UserY != n) {
                        UserY += 1;
                    }
                    break;
                case "L":
                    if (UserY != 1) {
                        UserY -= 1;
                    }
                    break;
                case "U":
                    if (UserX != 1) {
                        UserX -= 1;
                    }
                    break;
                case "D":
                    if (UserX != n) {
                        UserX += 1;
                    }
                    break;
            }
        }

        String finPosition = UserX + " " + UserY;
        System.out.println(finPosition);
    }
}
