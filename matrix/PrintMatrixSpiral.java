package matrix;
public class PrintMatrixSpiral {
    static void spiralMatrix(int[][] ar){
        int top = 0, bottom = ar.length - 1;
        int left = 0, right = ar[0].length - 1;

        while (left <= right && top <= bottom) {
            for(int i = left; i <= right; i++ ){
                System.out.print(ar[top][i]+" ");
            }
            top++;

            for(int i = top; i <= bottom; i++){
                System.out.print(ar[i][right]+" ");
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    System.out.print(ar[bottom][i]+" ");
                }
            }
            bottom--;

            if(left <= right){
                for(int i = bottom; i >= top; i-- ){
                    System.out.print(ar[i][left]+" ");
                }
            }
            left++;
        }
    }

    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3, 4}, {10, 11, 12, 5}, {9, 8, 7, 6}};
        spiralMatrix(ar);
    }
}
