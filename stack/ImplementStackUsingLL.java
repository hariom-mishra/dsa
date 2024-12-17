package stack;

import stack.exceptions.StackUnderFlowException;

public class ImplementStackUsingLL {
    int top = -1;
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void push(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        top++;
    }

    int pop() throws StackUnderFlowException{
        if (top == -1 || head == null) {
           throw new StackUnderFlowException("STACK_UNDERFLOW"); 
        }else{
            int val = head.data;
            head = head.next;
            return val;
        }
    }

    void printStack() throws StackUnderFlowException{
        if(head == null || top == -1){
            throw new StackUnderFlowException("STACK_UNDERFLOW");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ImplementStackUsingLL stack = new ImplementStackUsingLL();
        try {
            // stack.printStack();
            stack.push(0);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.printStack();
            stack.pop();
            stack.printStack();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
