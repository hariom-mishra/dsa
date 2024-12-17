public class KokoEatingBanana {
    static int findMin(int[] a, int h){
        int max = 0;
        int k = 0;
        for( int i : a)
            max = Math.max(max, i);

        int l = 1;
        while (l <= max) {
            int mid = l + (max -l)/2;
            if(isPossible(a, mid, h)){
                k = mid;
                max = mid -1;
            }else{
                l = mid + 1;
            }
        }
        return k;
    }

    static boolean isPossible(int[] a, int k, int h){
        int hour = 0;
        for(int i = 0; i < a.length; i++){
           hour += (int)Math.ceil((double)a[i]/k);
        }
        return h >= hour;
    }
    public static void main(String[] args) {
        int[] ar = {7, 15, 6, 3};
        int h = 8;
        System.out.println(findMin(ar, h));
    }
}
