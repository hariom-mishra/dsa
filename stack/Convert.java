package stack;
import java.util.Stack;

public class Convert {
    static boolean isOperator(char c){
        if(c == '^' || c == '/' || c == '*' || c == '+' || c == '-'){
            return true;
        }
        return false;
    }

    static int priority(char c1){
        if (c1 == '^') {
            return 3;
        }
        else if(c1 == '/' || c1 == '*'){
            return 2;
        }else if(c1 == '+' || c1 == '-'){
            return 1;
        }else{
            return 0;
        }

    }

    static String infixToPostFix(String str){
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        int i = 0;

        while( i < str.length()){
            char c = str.charAt(i);
            if (c == ')') {
                while (stack.peek() != '(') {
                    res.append(stack.pop());
                }
                stack.pop();
                i++;
            }
            else if(c == '('){
                stack.push(c);
                i++;
            }
            else if(!isOperator(c)){
                res.append(c);
                i++;
            } 
            else{
                while(stack.isEmpty() != true && priority(c) <= priority(stack.peek())){
                    res.append(stack.pop());
                }

                stack.push(c);
                i++;
            }
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        return res.toString();
    }
    static String reverse(String str){
        char[] res = str.toCharArray();
        for(int i = 0; i < res.length /2; i++){
            char c1 = res[i];
            char c2 = res[res.length - i -1];

            if(c1 == '(') c1 = ')';
            else if( c2 == ')') c2 = '(';
            else if(c1 == ')') c1 ='(';
            else if(c2 == '(') c2 = ')';
            
            res[i] = c2;
            res[res.length - i -1] = c1;
        }
        return String.valueOf(res);
    }

    static String infixToPrefix(String str){
        StringBuilder res = new StringBuilder();
        int i = 0;
        Stack<Character> stack = new Stack<Character>();
        str = reverse(str);
        
        while( i < str.length()){
            char c = str.charAt(i);
            if (c == ')') {
                while (stack.peek() != '(') {
                    res.append(stack.pop());
                }
                stack.pop();
                i++;
            }
            else if(c == '('){
                stack.push(c);
                i++;
            }
            else if(!isOperator(c)){
                res.append(c);
                i++;
            } 
            else{
                while(stack.isEmpty() != true && priority(c) < priority(stack.peek())){
                    res.append(stack.pop());
                }

                stack.push(c);
                i++;
            }
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        res = res.reverse();
        return res.toString();
    }

    static String postFixToInfix(String str){
        Stack<String> st = new Stack<String>();
        for(int i = 0; i < str.length(); i++){
            if(!isOperator(str.charAt(i))){
                st.push(String.valueOf(str.charAt(i)));
            }else{
                String s1 = st.pop();
                String s2 = st.pop();

                String res = String.format("(%s%c%s)", s2,str.charAt(i), s1);
                st.push(res);
            }
        }
        return st.pop();
    }

    static String prefixToInfix(String str){
        Stack<String> st = new Stack<String>();
        for(int i = str.length() -1; i >= 0; i--){
            if(!isOperator(str.charAt(i))){
                st.push(String.valueOf(str.charAt(i)));
            }else{
                String s1 = st.pop();
                String s2 = st.pop();

                String res = String.format("(%s%c%s)", s1,str.charAt(i), s2);
                st.push(res);
            }
        }
        return st.pop();
    }

    static String postfixToPrefix(String str){
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (!isOperator(str.charAt(i))) {
                stack.push(String.valueOf(str.charAt(i)));
            }else{
                String s1 = stack.pop();
                String s2 = stack.pop();

                String res = String.format("%c%s%s", str.charAt(i), s2, s1);
                stack.push(res);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String str = "a+b*(c^d-e)";
        String str2String = "AB-DE+F*/";
        String str3 = "*+PQ-MN";
        System.out.println(infixToPrefix(str));
        System.out.println(postFixToInfix(str2String));
        System.out.println(prefixToInfix(str3));
        System.out.println(postfixToPrefix(str2String));
    }
}
