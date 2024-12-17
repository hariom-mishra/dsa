package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    static int[] findNextGreater(int[] ar){
        int[] nextGreater = new int[ar.length];
        Stack<Integer> stack = new Stack<Integer>();
        int i = ar.length -1;

        while (i > 0) {
            if(stack.isEmpty()){
                nextGreater[i] = 0;
                stack.push(i);
                i--;
            }else if(ar[stack.peek()] > ar[i]){
                nextGreater[i] = stack.peek();
                stack.push(i);
                i--;
            }else{
                stack.pop();
            }
        }

        return nextGreater;
    }

    public static void main(String[] args) {
        int[] ar = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(Arrays.toString(findNextGreater(ar)));
    }
}
