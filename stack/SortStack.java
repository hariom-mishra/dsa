package stack;

import java.util.Stack;

public class SortStack {
    static void placeSorted(Stack<Integer> stack, int el){
        if(stack.isEmpty()){
            stack.push(el);
            return;
        } 
        else if(stack.peek() <= el){
            stack.push(el);
            return;
        } 

        int elem = stack.pop();
        placeSorted(stack, el);
        stack.push(elem);
    }
    static void sort(Stack<Integer> stack){
        if(stack.isEmpty()) return;

        int elem = stack.pop();
        sort(stack);
        placeSorted(stack, elem);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(-15);
        stack.add(-22);
        stack.add(33);
        stack.add(-99);
        stack.add(75);
        stack.add(7);
        sort(stack);
        
        int size = stack.size();
        for(int i = 0; i < size; i++){
            System.out.println(stack.pop());
        }
    }
}
