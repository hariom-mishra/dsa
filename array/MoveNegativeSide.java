import java.util.Arrays;

public class MoveNegativeSide {
    //constraint space complexity O(1)
    // constraint order of the +ve number sould not be changing
    static void move(int[] ar){
        int i = 0;
        
        while(i != ar.length){
            if(ar[i] > 0){
                int pos = findNextNegative(ar, i);
                if(pos == -1){
                    break;
                }else{
                    int el = ar[i];
                    ar[i] = ar[pos];
                    shiftArray(ar, i+1, pos, el);
                }
            }else{
                i++;
            }
        }
    }

    static int findNextNegative(int[] ar, int start){
        while (start < ar.length) {
            if(ar[start] < 0){
                return start;
            }
            start++;
        }
        return -1;
    }

    static void shiftArray(int[] ar, int start, int end, int el){
        while (start <= end) {
            int temp = ar[start];
            ar[start] = el;
            el = temp;
            start++;
        }
    }


    public static void main(String[] args) {
        int[] ar = {-1, -2, -3, 6, 8, 7, 10, -25, -20};
        move(ar);
        System.out.println(Arrays.toString(ar));
    }
}
