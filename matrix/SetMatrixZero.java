package matrix;

import java.util.Arrays;

public class SetMatrixZero{
    static void setZero(int[][] ar){
        int row = 1;
        //marking
        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar[0].length; j++){
                if(i == 0 && ar[i][j] == 0){
                    row = 0;
                }
                else if(ar[i][j] == 0){
                    ar[0][j] = 0;
                    ar[i][0] = 0;
                }
            }
        }

        //implementing
        for(int i = 1; i < ar.length; i++){
            for(int j = 1; j< ar[0].length; j++){
                if (ar[0][j] == 0 || ar[i][0] == 0) {
                    ar[i][j] = 0;
                }
            }
        }

        //for first column
        if(ar[0][0] == 0){
            for(int i  = 0; i < ar.length; i++){
                ar[i][0] = 0;
            }
        }

        //for first row
        if(row == 0){
            for(int i = 0; i< ar[0].length; i++){
                ar[0][i] = 0;
            }
        }
    }


    public static void main(String[] args) {
        int[][] ar= {
            {1, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {1, 0, 0, 1},
        };
        setZero(ar);

        for(int[] i : ar){
            System.out.println(Arrays.toString(i));
        }

    }
}