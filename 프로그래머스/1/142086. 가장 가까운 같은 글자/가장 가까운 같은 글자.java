import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character, Integer> lastindex = new HashMap<>();
        for (int i=0; i< s.length(); i++) {
            char c = s.charAt(i);
            if (lastindex.containsKey(c)) {
                answer[i] = i - lastindex.get(c);
            } else {
                answer[i] = -1;
            }
            lastindex.put(c, i);
        }
        
        return answer;
    }
}