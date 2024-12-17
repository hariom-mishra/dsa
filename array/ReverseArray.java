import java.util.Arrays;

public class ReverseArray {
    static void reverse(int[] ar){
        for(int i = 0; i < ar.length/2; i++){
            int temp = ar[i];
            ar[i] = ar[ar.length -i -1];
            ar[ar.length -i -1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 5};
        reverse(ar);
        System.out.println(Arrays.toString(ar));
    }
}
