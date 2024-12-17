import java.util.*;

class Solution {
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    static void qs(int[] arr, int low, int high) {
        if(low < high) {
            int index = partition(arr, low, high);
            qs(arr, low, index - 1);
            qs(arr, index + 1, high);
        }
    }
    public static void quickSort(int[] arr) {
        // Write your code here.
        qs(arr, 0, arr.length -1);
    }
}

class tUf {
    public static void main(String args[]) {
        int[] ar = { 1, 9, 2, 0, 4, 89, 11 };
        Solution.quickSort(ar);
        System.out.println(Arrays.toString(ar));
    }

} 