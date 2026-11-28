package S6;


import java.util.Stack;

// u will be using java inbuilt class
// why?? - to decide if stacjk can help of not./.
public class StackKnowledge {

    static void main() {
        Stack<Integer> stack = new Stack();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());

    }
}
