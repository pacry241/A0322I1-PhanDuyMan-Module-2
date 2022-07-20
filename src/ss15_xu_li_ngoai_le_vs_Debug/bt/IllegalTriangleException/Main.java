package ss15_xu_li_ngoai_le_vs_Debug.bt.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void checkRightTriangle(int a, int b, int c) throws IllegalTriangleException {
        int check = 1;
        if (a<0||b<0||c<0){
            check = 0;
            throw new IllegalTriangleException("không hợp lệ");
        }
        if (a+c <b||a+b<c||b+c<a){
            check = 0;
            throw new IllegalTriangleException("Không thõa mãn");
        }
        if (check ==1){
            System.out.println("Tam giác hợp lệ");
        }
    }

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        try{
            System.out.println("Nhập a = ");
            int input1= Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập b = ");
            int input2= Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập c = ");
            int input3= Integer.parseInt(scanner.nextLine());
            checkRightTriangle(input1,input2,input3);
        } catch (IllegalTriangleException er) {
            System.out.println("Exception "+er.getMessage());
        }
    }
}
