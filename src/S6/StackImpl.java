package S6;
// Array

//arr   [20 30 40 50 70 ]
//    -1[0  1  2   3 4]
//     t


//
//
//
//   20

public class StackImpl {
     int[] arr;  // initial size
     int top = -1; // stack is empty
     int capacity;

    StackImpl(int size){
        this.capacity = size;
        this.arr = new int[size];
    }

    public void push(int data){
        if(top == capacity-1){
            System.out.println("Stack is full!");
            return;
        }
        top++;
        arr[top] = data;// error??
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is Empty!");
            return -1;
        }
        int removing = arr[top];
        top--;
        return removing;
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    static void main() {
        StackImpl stack = new StackImpl(5);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);


        System.out.println(stack.pop()); // remove and return

        stack.push(70);

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
//        System.out.println(stack.pop()); // remove and return
//        System.out.println(stack.pop()); // remove and return
//        System.out.println(stack.pop()); // remove and return
//        System.out.println(stack.pop()); // remove and return
//        System.out.println(stack.pop()); // remove and return
//        stack.push(70);
//        stack.push(70);
//        stack.push(70);
    }

}
