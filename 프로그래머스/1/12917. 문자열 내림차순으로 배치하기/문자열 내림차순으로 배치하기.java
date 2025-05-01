class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        quicksort(arr, 0, s.length() - 1);
        String answer = new String(arr);
        return answer;
    }
    
    public void quicksort(char[] arr, int left, int right) {
        if (left < right) {
            char pivot = arr[(left + right) / 2];
            int index = partition(arr, left, right, pivot);
            
            quicksort(arr, left, index - 1);
            quicksort(arr, index, right);
        }
    }
    
    public int partition(char[] arr, int left, int right, char pivot) {
        while (left <= right) {
            while(arr[left] > pivot) left++;
            while(arr[right] < pivot) right--; 
            
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
    
    public void swap(char[] arr, int left, int right) {
        char tmp;
        tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}