package sorting;

import java.util.Arrays;

public class MergeSort {
    static void sort(int[] ar) {
        mergeSort(ar, 0, ar.length - 1);
    }

    static void mergeSort(int[] a, int low, int high) {
        if (low >= high)
            return;

        int mid = low + (high - low) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);
        merge(a, low, high, mid);
    }

    static void merge(int[] ar, int low, int high, int mid) {
        int i = low;
        int j = mid + 1;
        int[] ans = new int[high - low + 1];
        int pos = 0;

        while (i <= mid && j <= high) {
            if (ar[i] <= ar[j]) {
                ans[pos++] = ar[i++];
            } else {
                ans[pos++] = ar[j++];
            }
        }

        while (i <= mid) {
            ans[pos++] = ar[i++];
        }

        while (j <= high) {
            ans[pos++] = ar[j++];
        }

        for (int x = 0; x < ans.length; x++) {
            ar[low + x] = ans[x];
        }
    }

    public static void main(String[] args) {
        int[] ar = { 1, 9, 2, 0, 4, 89, 11 };
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
