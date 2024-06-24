package algorithmEx.chpt2;

public class Ex2_1 {
    public static void main(String[] args) {
        // 입력받은 10진수를 2진수~36진수로 기수 변환하여 출력
        int decNum = 1;
        int n = 3;

        long startTime = System.nanoTime();
        String converted = convDecTo(decNum, n);
        System.out.println("converted = " + converted);
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime + " ns");
    }
    static String convDecTo(int decNum, int n) {
        String strNum = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int sizeArr = digitsOf(decNum, n);
        char[] convArr = new char[sizeArr];

        do {
            for (int i = 0; i < sizeArr; i++) {
                convArr[i] = strNum.charAt(decNum % n);
                decNum /= n;
            }

        } while (decNum != 0);

        StringBuilder sb = new StringBuilder(String.valueOf(convArr));
        return sb.reverse().toString();
    }

    static int digitsOf(int decNum, int n) {
        int count = 1;
        int initVal = n;
        while (n <= decNum) {
            n *= initVal;
            count++;
        }

        return count;
    }
}
