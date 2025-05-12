import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, String> numberMap = new HashMap<>();
        numberMap.put("zero", "0");
        numberMap.put("one", "1");
        numberMap.put("two", "2");
        numberMap.put("three", "3");
        numberMap.put("four", "4");
        numberMap.put("five", "5");
        numberMap.put("six", "6");
        numberMap.put("seven", "7");
        numberMap.put("eight", "8");
        numberMap.put("nine", "9");

        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                result.append(ch);
            } else {
                temp.append(ch);
                if (numberMap.containsKey(temp.toString())) {
                    result.append(numberMap.get(temp.toString()));
                    temp.setLength(0);
                }
            }
        }

        return Integer.parseInt(result.toString());
    }
}