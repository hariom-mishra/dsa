package stack;

import java.util.Stack;

public class PopMiddle {
    static int stackCount(Stack<Integer> s1){
        if(s1.empty()){
            return 0;
        }
        int top = s1.pop();
        int size = stackCount(s1) + 1;
        s1.push(top);

        return size;
    }

    static int pop(Stack<Integer> s1, int mid, int top){
        if(top == mid){
            int val = s1.pop();
            return val;
        }

        int elem = s1.pop();
        int popped = pop(s1, mid, --top);
        s1.push(elem);
        return popped;
    }

    public static void main(String[] args) {
        Stack s1 = new Stack<Integer>();
        s1.push(5);
        s1.push(3);
        s1.push(2);
        s1.push(1);
        s1.push(0);
        int top = stackCount(s1);
        
        System.out.println(pop(s1, (top - 1)/2, top - 1));
    }
}
