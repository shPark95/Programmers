class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i<len; i++) {
            if (s.charAt(i) == ' ') {
                sb.append(' ');
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                sb.append((char)((s.charAt(i) - 'A' + n) % 26 + 'A'));
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append((char)((s.charAt(i) - 'a' + n) % 26 + 'a'));
            }
        }
        answer = sb.toString();
        
        return answer;
    }
}