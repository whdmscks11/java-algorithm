package algorithmEx.chpt1;

public class Ex3_1_1 {
    public static void main(String[] args) {
        // '+' 와 '-'를 번갈아 n개 출력하는 프로그램 작성

        int n = 10;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("+");
            } else
                System.out.println("-");
        }
    }
}
/*
위 코드의 문제점
  - for문이 실행 될 때마다 i가 홀수인지 양수인지 판단하기 위해
    if문을 n번 실행해야 한다.

  - 카운터용 변수인 i의 값이 0이 아닌 1로 시작하게 되면
    루프 본문의 내용도 함께 바뀌어야 한다. ['+'가 먼저 출려되어야 하기 때문이다.]
 */