class Solution {
    public String solution(String s) {
        String answer = "";
        
        int index = 1;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(s.charAt(i));
                index = 0;    
            } else {
                if (index % 2 == 1) {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
            index++;
        }
        answer = sb.toString();
        
        return answer;
    }
}