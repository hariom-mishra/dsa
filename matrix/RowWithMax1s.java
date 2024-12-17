package matrix;

public class RowWithMax1s {
    static int findRow(int[][] ar){
        int max = Integer.MIN_VALUE;
        int row = -1;
        for(int i = 0; i < ar.length; i++){
            int count = countOnes(ar, i);
            if(count > max){
                max = count;
                row = i;
            }
        }
        return row;
    }

    static int countOnes(int[][] ar, int row){
        int low = 0, high = ar[row].length -1;
        int ansPos = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(ar[row][mid] == 1){
                ansPos = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        
        if(ansPos == -1)
            return 0;

        return ar[row].length - ansPos;
    }
    public static void main(String[] args) {
        int ar[][] = {{0, 0, 0, 0}, {0, 0, 1, 1}, {0, 0, 0, 1}, {0, 1,  1, 1}};
        System.out.println(findRow(ar));
    }
}
