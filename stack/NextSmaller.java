package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmaller {
    static int[] findNext(int[] ar){
        int[] nextSm = new int[ar.length];
        Stack<Integer> stack = new Stack<Integer>();

        int i = ar.length - 1;
        while(i >= 0){
            if(stack.isEmpty()){
                nextSm[i] = ar.length;
                stack.push(i);
                i--;
            }else if(ar[stack.peek()] < ar[i]){
                nextSm[i] = stack.peek();
                stack.push(i);
                i--;
            }else{
                stack.pop();
            }
        }

        return nextSm;
    }

    public static void main(String[] args) {
        int[] ar = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(findNext(ar)));
    }
    
}
