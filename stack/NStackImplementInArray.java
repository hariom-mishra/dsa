package stack;

public class NStackImplementInArray {
    int[] ar;
    int[] top;
    int[] next;
    int freespot;

    public NStackImplementInArray(int size, int k){
        ar = new int[size];
        top = new int[k];
        next = new int[size];
        freespot = 0;
    }

    public void push(int element, int stack){
        //get the index
        int index = freespot;
        //update freespot
        freespot = next[index];
        //insert the element into the array
        ar[index] = element;
    }

    public int pop(){

    }

    public static void main(String[] args) {
        
    }
}
