package sorting;

import java.util.Arrays;

public class SelectionSorting {

    //T.C. = n + n-1 + n-2....2 ~ n* (n-1)/2 = n^2/2 -n/2 = n^2 for Best/avg/worst
    static void sort(int[] ar) {
        for(int i = 0; i < ar.length; i++){
            for(int j = i; j < ar.length; j++){
                if(ar[i] > ar[j]){
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ar = { 1, 9, 2, 0, 4, 89, 11 };
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
