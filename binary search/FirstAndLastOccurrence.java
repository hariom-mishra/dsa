import java.util.Arrays;

public class FirstAndLastOccurrence {
    static int[] findFirstAndLast(int[] ar, int x){
        int[] res = new int[2];
        int first = findFirst(ar, x);
        int last = findLast(ar, x);
        res[0] = first;
        res[1] = last;
        return res;
    }

    static int findFirst(int[] ar, int x){
        int ans = -1;
        int l = 0, r = ar.length -1;
        while (l <= r) {
            int mid = (l + r)/2;
            if (ar[mid] == x ) {
                ans = mid;
                r = mid -1;
            }else if(ar[mid] > x){
                r = mid -1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }

    static int findLast(int[] ar, int x){
        int ans = -1;
        int l = 0, r = ar.length -1;
        while (l <= r) {
            int mid = (l + r) /2;
            if (ar[mid] == x ) {
                ans = mid;
                l = mid + 1;
            }else if(ar[mid] < x){
                l = mid + 1;
            }else{
                r = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 4, 4, 4, 5, 6};
        System.out.println(Arrays.toString(findFirstAndLast(ar, 6)));
    }
}
