import java.util.Arrays;

public class AggressiveCows {
    static int minDistanceisMaximum(int[] ar, int k){
        int ans = 0;
        Arrays.sort(ar);
        int max = ar[ar.length -1] - ar[0];
        int l = 0;
        while(l <= max){
            int mid = l + (max - l)/2;
            if (isPossible(ar, k, mid)) {
                ans = mid;
                l = mid + 1;
            }else{
                max = mid - 1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] ar, int k, int dist){
        int count = 1;
        int prev = ar[0];
        for(int i = 1; i < ar.length; i++){
            if(ar[i] - prev >= dist){
                prev = ar[i];
                count++;
            }
        }
        return count >= k;
    }
    
    public static void main(String[] args) {
        int[] ar = {0, 3, 4, 7, 9, 10};
        int cows = 4;
        System.out.println(minDistanceisMaximum(ar, cows));
    }
}
