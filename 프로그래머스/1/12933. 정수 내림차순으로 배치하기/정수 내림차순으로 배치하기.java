class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char arr[] = str.toCharArray();

        quickSort(arr, 0, arr.length - 1);

        String sortedStr = new String(arr);

        return Long.parseLong(sortedStr);
    }

    private void quickSort(char[] arr, int left, int right) {
        if (left >= right) return;

        char pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);

        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);
    }

    private int partition(char[] arr, int left, int right, char pivot) {
        while (left <= right) {
            while (arr[left] > pivot) left++;
            while (arr[right] < pivot) right--;

            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}