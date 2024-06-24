package algorithmEx.chpt2;

public class Ex3_2 {
    public static void main(String[] args) {
        // 입력받은 수 n 이하의 모든 소수를 출력하는 프로그램

        int[] prime = primeUnder(1_000);
        for (int i : prime) {
            if (i == 0) {
                break;
            }
            System.out.println(i);
        }
    }

    public static int[] primeUnder(int n) {
        int[] prime = new int[n/2];
        prime[0] = 2;

        for (int i = 3; i <= n; i++) {
            int count = 0;
            boolean isNotPrime = false;
            while(prime[count] != 0){
                if(i % prime[count] == 0){
                    isNotPrime = true;
                    break;
                }
                count++;
            }
            if (!isNotPrime) {
                prime[count] = i;
            }
        }

        return prime;
    }
}