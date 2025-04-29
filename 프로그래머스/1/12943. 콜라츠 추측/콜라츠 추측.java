class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        if (n == 1) {
            return 0;
        }
        while (true) {
            answer ++;
            
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n*3 + 1;
            }
            
            if (n == 1) {
                return answer;
            } else if (answer >= 500) {
                return -1;
            }
        }
    }
}