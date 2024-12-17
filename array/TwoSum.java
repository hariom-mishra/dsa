import java.util.Arrays;

public class TwoSum {
    static int[] sum(int[] ar, int target){
        int[] res = new int[2];
        int i = 0;
        int j = ar.length-1;
        while (i<j) {
            if(ar[i] + ar[j] == target){
                res[0] = i;
                res[1] = j;
                return res;
            }else if(ar[i] + ar[j] < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sum(ar, 7)));
    }
}
