package ss11_Stack_Queue.Bt.dao_nguoc;

import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Stack<String> mStack = new Stack<>();

        String str="Một Hai Ba Bốn Năm Sáu Bảy Tám Chín Mười";
        String[] arrayStr=str.split(" ");

        String temp;
        int loop = arrayStr.length;

        for (int i = 0; i<loop;i++){
            wStack.push(arrayStr[i]);
        }
        System.out.println(wStack);

        System.out.println(wStack.size());

        int loop1 = wStack.size();

        for (int i = 0; i<loop1;i++){
            temp = wStack.pop();
            mStack.push(temp);
        }
        System.out.println(mStack);

    }
}
