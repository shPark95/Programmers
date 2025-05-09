class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int l = p.length();
        for (int i=0; i<=t.length()-l; i++) {
            String s = t.substring(i, i+l);
            if (s.compareTo(p) <= 0) {
                answer++;
            }
        }
        
        return answer;
    }
}