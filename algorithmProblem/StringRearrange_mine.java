package algorithmProblem;

import java.util.*;

public class StringRearrange_mine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] charArray = input.toUpperCase().toCharArray();
        Map<Character, Integer> charNum = new LinkedHashMap<>();
        charNum.put('0', 1);
        charNum.put('1', 1);
        charNum.put('2', 2);
        charNum.put('3', 3);
        charNum.put('4', 4);
        charNum.put('5', 5);
        charNum.put('6', 6);
        charNum.put('7', 7);
        charNum.put('8', 8);
        charNum.put('9', 9);

        Arrays.sort(charArray);
        Set<Map.Entry<Character, Integer>> entries = charNum.entrySet();

        int sum = 0;
        for (char c : charArray) {
            for (Map.Entry<Character, Integer> entry : entries) {
                if (c == entry.getKey()) {
                    sum += entry.getValue();
                }
            }
        }
        List<Character> charList = new LinkedList<>();
        for (char c : charArray) {
            Set<Character> keySet = charNum.keySet();
            if (!keySet.contains(c)) {
                charList.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charList) {
            sb.append(character);
        }
        String string = sb.toString() + sum;
        System.out.println(string);
    }
}
