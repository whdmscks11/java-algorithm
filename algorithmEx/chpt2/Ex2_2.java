package algorithmEx.chpt2;

public class Ex2_2 {
    public static void main(String[] args) {
        // 입력받은 10진수를 2진수~36진수로 기수 변환하여 출력
        int decNum = 1_000_000;
        int n = 16;
        char[] cno = new char[32];

        long startTime = System.nanoTime();
        int dno = cardConv(decNum, n, cno);
        for (int i = 0; i < dno; i++) {
            System.out.print(cno[i]);
        }
        System.out.println();
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime + " ns");
    }
        static int cardConv(int x, int r, char[] d){
            int digits = 0;
            String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            do{
                d[digits++] = dchar.charAt(x % r);
                x /= r;
            } while (x != 0);

            for (int i = 0; i < digits / 2; i++) {
                char t = d[i];
                d[i] = d[digits - i - 1];
                d[digits - i - 1] = t;
            }

            return digits;
    }
}
