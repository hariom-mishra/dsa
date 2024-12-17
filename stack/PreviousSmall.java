package stack;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmall {

    static int[] getPrev(int[] ar){
        int[] prevSm = new int[ar.length];
        Stack<Integer> stack = new Stack<Integer>();

        int i = 0;
        while(i < ar.length){
            if(stack.isEmpty()){
                stack.push(i);
                prevSm[i] = -1;
                i++;
            }else if(ar[stack.peek()] < ar[i]){
                prevSm[i] = stack.peek();
                stack.push(i);
                i++;
            }else{
                stack.pop();
            }
        }

        return prevSm;
    }

    public static void main(String[] args) {
        int[] ar = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(getPrev(ar)));
    }
    
}
