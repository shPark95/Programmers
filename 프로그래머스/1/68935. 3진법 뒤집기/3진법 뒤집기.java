class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.insert(0, n % 3);
            n /= 3;
        }
        String s = sb.reverse().toString();
        
        for (int i = 0; i < s.length(); i ++) {
            int num = s.charAt(s.length() - 1 - i) - '0';
            answer += num * (int)Math.pow(3, i);
        }
        
        
        return answer;
    }
}