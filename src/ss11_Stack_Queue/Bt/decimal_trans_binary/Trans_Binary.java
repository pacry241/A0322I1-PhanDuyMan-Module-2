package ss11_Stack_Queue.Bt.decimal_trans_binary;

import java.util.Scanner;
import java.util.Stack;

public class Trans_Binary {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số");
        int decimal = scanner.nextInt();
        int temp = decimal;

        do{
            myStack.push(temp%2);
            temp /= 2;
        }while (temp!= 0);

        System.out.println("Số thập phân "+decimal+" chuyển qua hệ nhị phân là :");
        while (!myStack.empty()){
            System.out.print(myStack.pop());
        }
    }
}
