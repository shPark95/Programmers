class Solution {
    public long solution(long n) {
        long answer = 0;
        while (true) {
            answer++;
            if (n < answer * answer) {
                return -1;
            } else if (n == answer * answer) {
                answer++;
                break;
            }
        }
        return answer * answer;
    }
}