package ss03_Array_and_Method_Java.BaiTap.Insert_element_in_array;
import java.util.Scanner;

public class MainInsertElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cần thêm : ");
        int number = input.nextInt();
        int index;
        int[] arr = {4, 12, 7, 8, 1, 6, 9,0,0,0};
        do {
            System.out.println("Nhập vị trí cần thêm");
            index= input.nextInt();
        }
        while (index <0 && index >arr.length-11);
        for(int i = arr.length -1; i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=number;
        for (int element : arr){
            System.out.print(element+" ");
        }
    }
}
