import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringRearrange_AI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // 알파벳을 저장할 리스트
        ArrayList<Character> letters = new ArrayList<>();
        // 숫자의 합을 저장할 변수
        int sum = 0;

        // 입력 문자열을 하나씩 순회하며 처리
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {  // 숫자인 경우
                sum += ch -'0';  // 문자를 숫자로 변환하여 더하기
            } else if (Character.isLetter(ch)) {  // 알파벳인 경우
                letters.add(ch);
            }
        }

        // 알파벳 리스트를 오름차순으로 정렬
        Collections.sort(letters);

        // 결과 문자열을 생성
        StringBuilder result = new StringBuilder();
        for (char letter : letters) {
            result.append(letter);
        }
        result.append(sum);

        // 결과 출력
        System.out.println(result.toString());
    }
}
