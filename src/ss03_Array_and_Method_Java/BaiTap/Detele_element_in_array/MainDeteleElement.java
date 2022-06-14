package ss03_Array_and_Method_Java.BaiTap.Detele_element_in_array;
import java.util.Scanner;
public class MainDeteleElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int index =0;
        int[] arr = {4, 12, 7, 8, 1, 6, 9,0,0,0};
        for (int i =0; i<arr.length;i++){
            if (arr[i] == number){
                System.out.println("Element " + i);
                index = i;
                break;
            }
        }
        for(;index<arr.length-1;index++){
            arr[index] = arr[index+1];
        }
        for (int element : arr){
            System.out.print(element+" ");
        }
    }
}
