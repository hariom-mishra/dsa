import java.util.Arrays;

public class Sort012{
    static void sort(int[] ar){
        int low = 0;
        int mid = 0;
        int high = ar.length - 1;
        while(mid <= high){
            if(ar[mid]==0){
                swap(ar, low, mid);
                mid++;
                low++;
            }else if(ar[mid] == 1){
                mid++;
            }else{
                swap(ar, mid, high);
                high--;
            }

        }

    }

    static void swap(int[] ar, int a, int b){
        System.out.println(a+" "+b);
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }

    public static void main(String[] args) {
        int[] ar = {2, 1, 0, 1, 2, 0};
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}