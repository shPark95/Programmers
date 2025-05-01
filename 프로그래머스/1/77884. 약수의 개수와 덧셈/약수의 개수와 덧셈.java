import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {        
        return IntStream.rangeClosed(left, right)
                .map(i -> isPerfectSquare(i) ? -i : i)
                .sum();
    }
    
    public boolean isPerfectSquare(int num) {
        for (int i = 1; i <= num; i++ ) {
            if (i * i == num)
                return true;
        }
        return false;
    }
}