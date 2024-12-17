package sorting;

import java.util.Arrays;

public class BubbleSorting {
    //Best TC: O(N)
    //worst and avg: O(N^2)
    static void sort(int[] ar) {
        for(int i = 0; i < ar.length; i++){
            boolean didSwap = false;
            for(int j = 1; j < ar.length - i; j++){
                if (ar[j - 1] > ar[j]) {
                    int temp = ar[j - 1];
                    ar[j -1] = ar[j];
                    ar[j] = temp;
                    didSwap = true;
                }
            }
            if (didSwap == true) {
                didSwap = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] ar = { 1, 9, 2, 0, 4, 89, 11 };
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
