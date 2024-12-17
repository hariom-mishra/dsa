package sorting;

import java.util.Arrays;;

public class InsertionSort {
    //Best TC: O(N)
    //worst & avg: O(N2)
    static void sort(int[] ar){
        for(int i = 1; i < ar.length; i++){
            int j = i -1;
            int key = ar[i];

            while(j >= 0 && key < ar[j]){
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = key; 
        }
    }

    public static void main(String[] args) {
        int[] ar = { 1, 9, 2, 0, 4, 89, 11 };
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
