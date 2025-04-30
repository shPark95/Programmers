import java.util.stream.IntStream;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int index = IntStream.range(0, seoul.length)
                            .filter(x -> "Kim".equals(seoul[x]))
                            .findFirst()
                            .orElse(-1);
        
        return "김서방은 " + index + "에 있다";
    }
}