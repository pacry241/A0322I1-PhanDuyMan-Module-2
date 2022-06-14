package ss03_Array_and_Method_Java.BaiTap.Finf_min_in_array;
import ss03_Array_and_Method_Java.ThucHanh.Find_minium_in_array.MainFindMinium;

import java.net.BindException;
import java.util.Scanner;
public class MainFindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        int index;
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        index = MainFindMinium.minValue(array);
        System.out.println("Phần tử nhỏ nhất trong mảng là: "+ array[index]);
    }
}
