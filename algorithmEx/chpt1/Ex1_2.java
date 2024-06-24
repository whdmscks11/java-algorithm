package algorithmEx.chpt1;

public class Ex1_2 {
    public static void main(String[] args) {
        // 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드 작성
            // a와 b의 대소관계에 상관 없이 합을 구하시오
        int result = sumof(14, 10);
        System.out.println("result = " + result);
    }

    static int sumof(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }
}
