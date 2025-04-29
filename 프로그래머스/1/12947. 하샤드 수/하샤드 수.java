class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int y = x;
        int sum = 0;
        while (true) {
            if (x <= 0) {
                break;
            }
            sum += x % 10;
            x /= 10;
        }
        if (y % sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}