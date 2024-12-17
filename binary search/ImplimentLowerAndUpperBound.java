public class ImplimentLowerAndUpperBound {
    static int lowerBound(int[] ar, int x){
        int l = 0;
        int r = ar.length -1;
        int ans = -1;
        while(l <= r){
            int mid = (l + r)/2;
            if(ar[mid] == x || ar[mid] > x){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }

    static int upperBound(int[] ar, int y){
        int ans = -1;
        int l = 0;
        int r = ar.length -1;
        while (l <= r) {
            int mid = (l + r)/2;
            if( ar[mid] < y ){
                ans = mid;
                l = mid + 1;
            }else{
                r = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 7, 9, 11};
        System.out.println(lowerBound(ar, 1));
        System.out.println(upperBound(ar, 1));
    }
}
