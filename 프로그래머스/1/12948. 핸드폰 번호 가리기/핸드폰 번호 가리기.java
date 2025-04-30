class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        
        String pre = "*".repeat(len -4);
        String pro = phone_number.substring(len -4);
        answer = pre + pro;
            
        
        return answer;
    }
}