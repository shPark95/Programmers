class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n, m), n*m/gcd(n,m)};
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}