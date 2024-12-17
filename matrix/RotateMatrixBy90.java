package matrix;

import java.util.Arrays;

public class RotateMatrixBy90 {
    static void rotate(int[][] ar){
        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j<= i; j++){
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3}, {10, 11, 12}, {9, 8, 7}};
        rotate(ar);
        for(int[] i: ar){
            System.out.println(Arrays.toString(i));
        }
    }
}
