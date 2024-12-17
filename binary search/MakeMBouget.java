public class MakeMBouget {
    static int findDays(int[] a, int k, int m){
        int days = -1;
        int max = Integer.MIN_VALUE;
        for( int i : a)
            max = Math.max(i, max);
        int l = 0;
        while (l <= max) {
            int mid = l + (max - l)/2;
            if(isPossible(a, k, m, mid)){
                days = mid;
                max = mid -1;
            }else{
                l = mid + 1;
            }
        }
        return days;
    }

    static boolean isPossible(int[] a, int k, int m, int val){
        int numberOfBougets = 0;
        int countAdj = 0;
        for(int i = 0; i< a.length; i++){
            if(a[i] <= val){
                countAdj++;
            }else{
                countAdj = 0;
            }
            if(countAdj == k){
                numberOfBougets++;
                countAdj = 0;
            }
        }
        return numberOfBougets >= m;
    }
    public static void main(String[] args) {
        int[] ar = {1, 10, 3, 10, 2};
        int k = 2, m = 3;
        System.out.println(findDays(ar, k, m));

    }
}
