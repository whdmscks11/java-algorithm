package algorithmEx.chpt1;

public class Ex1 {
    public static void main(String[] args) {
        // 가우스의 덧셈을 사용하여 1 부터 n 까지의 합을 구하라
        int result = gausAdd(10, 1);
        System.out.println("result = " + result);
    }
    static int gausAdd(int start, int end){
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        return ( start + end ) * ( end - start + 1 ) / 2;
    }
}
