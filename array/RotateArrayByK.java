import java.util.Arrays;

public class RotateArrayByK {

    static void rotate(int[] ar, int k){
        //reverse the entire array
        reverse(ar, 0, ar.length);
        System.out.println(Arrays.toString(ar));
        //reverse the first k
        reverse(ar, 0, k);
        System.out.println(Arrays.toString(ar));
        //reverse the remaining
        reverse(ar, k, ar.length);
        System.out.println(Arrays.toString(ar));
    }

    static void reverse(int[] ar, int st, int l){
        int mid = (st + l)/2 + (st + l)%2;
        for(int i = st, j = l -1; i< mid; i++, j--){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7, 8, 9};
        rotate(a, 3);
    }
}
