package ss11_Stack_Queue.Bt.dao_nguoc;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer>  myStack = new Stack<>();
        Stack<Integer>  reverseStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack);
        int temp, loop = myStack.size();

        for (int i = 0; i<loop;i++){
            temp = myStack.pop();
            reverseStack.push(temp);
        }
        System.out.println(reverseStack);
    }
}
