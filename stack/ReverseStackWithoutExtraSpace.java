package stack;
import java.util.Stack;;

public class ReverseStackWithoutExtraSpace {
    static void putBottom(Stack<Integer> stack, int val){
        if(stack.isEmpty()){
            stack.push(val);
            return;
        }

        int elem = stack.pop();
        putBottom(stack, val);
        stack.push(elem);
    }
    static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()) return;

        int elem = stack.pop();
        reverse(stack);
        putBottom(stack, elem);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        reverse(stack);
        int size = stack.size();
        for(int i = 0; i < size; i++){
            System.out.print(stack.pop());
        }
    }
}
