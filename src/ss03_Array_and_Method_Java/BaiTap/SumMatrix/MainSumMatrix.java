package ss03_Array_and_Method_Java.BaiTap.SumMatrix;

import java.util.Scanner;

public class MainSumMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        int Sum = 0;
        int index;
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        // khai báo ma trận A có m dòng, n cột
        int array[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        do {
            System.out.println("Nhập vị trí cột cần tính là :");
            index = scanner.nextInt();
        }while (index<0 || index >m);
        System.out.println("Nhập vị trí cột cần tính là :");
        index = scanner.nextInt();
        for (int i = 0;i<m;i++){
            Sum +=array[i][index];
        }
        System.out.print("Tổng của cột thứ "+index +" là "+Sum);
    }
}
