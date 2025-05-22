import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i<numbers.length; i++) {
            for (int j = i +1; j< numbers.length; j++) {
                numSet.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> resultList = new ArrayList<>(numSet);
        Collections.sort(resultList);
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}