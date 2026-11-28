package S6;

import java.util.Stack;

public class BalancedParanthesis {

    // pseudo code
    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch =='{' || ch=='['){
                stack.push(ch);
            }

            else{// closing bracket
                if(stack.isEmpty()){ // i have closing, but there is no opening available
                    return false;
                }

                char top = stack.pop();//opening

                if(ch ==')' && top!='('){ // i have closing and ppening, but its not matching
                    return false;
                }
                if(ch ==']' && top!='['){
                    return false;
                }
                if(ch =='}' && top!='{'){
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

    //"}"

    static void main() {
        String str = "{[]}[]";
        System.out.println(isBalanced(str));
    }
}
