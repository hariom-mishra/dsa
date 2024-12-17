package stack;

import java.util.Stack;

public class ParenthesisMatching {
    public static boolean isOpen(char c1){
        if(c1 == '(' || c1 == '[' || c1 == '{' || c1 == '<') return true;
        return false;
    }

    public static boolean oposite(char c1, char c2){
        if(c1 == '(' && c2 == ')') return true;
        else if(c1 == '{' && c2 == '}') return true;
        else if(c1 == '[' && c2 == ']') return true;
        else if(c1 == '<' && c2 == '>') return true;
        else return false;
    }

    public static boolean match(String str){
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i < str.length(); i++){
            if(isOpen(str.charAt(i))){
                st.push(str.charAt(i));
            }else{  
                if(st.isEmpty()) return false;
                else if(!oposite(st.pop(), str.charAt(i))){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(())";
        System.out.println(match(str));
    }
}
