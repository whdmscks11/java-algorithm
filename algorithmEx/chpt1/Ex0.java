package algorithmEx.chpt1;

public class Ex0 {
    public static void main(String[] args) {
        // N개의 수가 주어 졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오
        int n = 100;
        int count = 1;

        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.println(count++);
        }
    }
}
