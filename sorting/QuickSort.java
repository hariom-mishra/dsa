package sorting;

import java.util.Arrays;;

public class QuickSort {
    static void sort(int[] ar) {
        quickSort(ar, 0, ar.length -1);
    }

    static void quickSort(int[] ar, int low, int high){
        if(low < high) {
            int index = placePivot(ar, low, high);
            quickSort(ar, low, index - 1);
            quickSort(ar, index + 1, high);
        }
    }

    static int placePivot(int ar[], int low, int high){
        int pivot = ar[low];
        int i = low;
        int j = high;
        while (i < j) {
           while (ar[i] <= pivot && i <= high -1) {
            i++;
           }

           while (ar[j] > pivot && j >= low + 1) {
            j--;
           }

           if (i < j) {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
           }
        }

        int temp = ar[low];
        ar[low] = ar[j];
        ar[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        int[] ar = { 1, 9, 2, 0, 4, 89, 11 };
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
