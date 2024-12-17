public class BookAllocation {
    static int maxAllocation(int[] ar, int k){
        int high = 0;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i : ar){
            high += i;
            max = Math.max(max, i);
        }
    
        while (max <= high) {
            int mid = max + (high - max)/2;
            if(isPossible(ar, k, mid)){
                ans = mid;
                high = mid -1;
            }else{
                max = mid +1;
            }
        }

        return ans;
    }
    //start with one students and then move to next student when page exceeds
    static boolean isPossible(int[] ar, int k, int page){
        int count = 1;
        int tempCount = 0;
        for(int i = 0; i< ar.length; i++){
            if(tempCount + ar[i] <= page){
                tempCount += ar[i];
            }else{
                count++;
                tempCount = ar[i];
            }
        }
        return k >= count;
    }
    public static void main(String[] args) {
        int[] ar = {12, 34, 67, 90};
        int m = 2;
        System.out.println(maxAllocation(ar, m));
    }
}
