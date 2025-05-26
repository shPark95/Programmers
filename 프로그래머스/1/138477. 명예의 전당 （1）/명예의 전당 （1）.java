import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> answerList = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int s : score) {
            if (pq.size() < k) {
                pq.add(s);
            } else if (s > pq.peek()) {
                pq.poll();
                pq.add(s);
            }
            answerList.add(pq.peek());
        }
        
        for (int i =0; i< answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}