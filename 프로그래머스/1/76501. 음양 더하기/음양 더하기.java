import java.util.stream.IntStream;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = IntStream.range(0, absolutes.length)
                        .map(i -> signs[i] ? absolutes[i] : -absolutes[i])
                        .sum();
        return answer;
    }
}