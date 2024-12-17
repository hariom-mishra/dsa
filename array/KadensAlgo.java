public class KadensAlgo {
    static int findMaximumSubarraySum(int [] ar){
        int i = 0;
        int sum = 0;
        int max = ar[i];
        while (i < ar.length) {
            if(sum < 0){
                sum = 0;
            }
            sum = sum + ar[i];
            max = Math.max(sum, max);
            i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] ar = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(findMaximumSubarraySum(ar));
    }
}
