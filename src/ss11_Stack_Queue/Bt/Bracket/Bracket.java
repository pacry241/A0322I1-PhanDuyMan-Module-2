package ss11_Stack_Queue.Bt.Bracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Stack<Character> leftStack = new Stack();
        Stack<Character> rightStack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi ký tự có Breacket: ");
        String inputString = scanner.nextLine();

        char leftBracket = '(';
        char rightBracket = ')';
        int loop = inputString.length();

        for (int index = 0; index < loop; index++){
            if (inputString.toLowerCase().charAt(index)== leftBracket){
                leftStack.add(leftBracket);
            }else {
                if (inputString.toLowerCase().charAt(index)== rightBracket){
                    rightStack.add(rightBracket);
                }
            }
        }

        if(leftStack.isEmpty()){
            System.out.println("Chuỗi have no bracket Left '(' => FALSE");
        }else if(rightStack.isEmpty()){
            System.out.println("Chuỗi have no bracket Right ')' => FALSE");
        }else{
            if(leftStack.size() != rightStack.size()){
                System.out.println("Số lượng bracket Right and Left không bằng nhau => FALSE");
            }else{
                System.out.println("Số lượng bracket Right and Left bằng nhau => TRUE");
            }
        }
    }
}
