package stack;
import java.util.Arrays;

import stack.exceptions.StackUnderFlowException;

public class ImplementStackUsingArray{
    int top = -1;
    int[] ar;

    public ImplementStackUsingArray(int size){
        this.ar = new int[size];
    }

    void push(int val){
        if(top == ar.length - 1){
            System.out.println("STACK_OVERFLOW");
            return;
        }
        ar[++top] = val;
    }

    int pop() throws StackUnderFlowException{
        if(top == -1){
            throw new StackUnderFlowException("STACK_UNDER");
        }else{
            int val = ar[top--];
        return val;
        }
    }

    void printStack(){
        for(int i = top; i >= 0; i--){
            System.out.print(ar[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ImplementStackUsingArray stack = new ImplementStackUsingArray(4);
        stack.push(0);
        stack.printStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        try {
            stack.pop();
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printStack();
        } catch (StackUnderFlowException e) {
           System.out.println(e.getMessage());
        }
    }
}
