package algorithmEx.chpt2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 배열을 만들고 배열의 요소를 역순으로 정렬
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 길이 : ");
        int length = sc.nextInt();

        int[] nums = new int[length];

        System.out.println("각 요소의 값을 입력하세요 : ");
        setArrVal(nums);

        System.out.println("nums[] = "  + Arrays.toString(nums));
        System.out.println();

        System.out.println("배열의 요소를 역순으로 :");
        reverseArr(nums);
        System.out.println("nums[] = "  + Arrays.toString(nums));

    }
    static void setArrVal(int[] arr) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("num[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }

    static void reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swapElement(arr, i, arr.length - i - 1);
        }
    }

    static void swapElement(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
