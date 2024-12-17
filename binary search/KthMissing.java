public class KthMissing {
    static int findMissing(int[] ar, int k){
        int missing = Integer.MIN_VALUE;
        int left = 0, right = ar.length -1;
        while (left <= right) {
            int mid = left + (right -left)/2;
            //find how many missing at the mid
            if(ar[mid] - (mid + 1) >= k){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }

        if(right <  0){
            return k;
        }
        int numberOfMissingsAtright = ar[right] - right + 1;
        missing = ar[right] + (k - numberOfMissingsAtright);

        return missing;
    }
    public static void main(String[] args) {
        int[] ar = {2, 3, 4, 7, 11};
        int k = 1;
        System.out.println(findMissing(ar, k));
    }
}
