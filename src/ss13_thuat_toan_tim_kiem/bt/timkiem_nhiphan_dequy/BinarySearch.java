package ss13_thuat_toan_tim_kiem.bt.timkiem_nhiphan_dequy;

import java.util.Scanner;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }


    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int binarySearch(int arr[], int value,int left, int right){
        int mid = (left + right)/2;
        if(right <= left){
            return -1;
        }else{
            if(arr[mid] < value){
                return binarySearch(arr, value,left+1,right);
            }
            if(arr[mid] > value){
                return binarySearch(arr, value,left,right-1);
            }
            if(arr[mid] == value){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int [] myArr = new int[10];
//        Scanner scanner = new Scanner(System.in);
//
//
//        for (int i =0; i< myArr.length;i++){
//            System.out.println("Nhập phần tử thứ "+i);
//            int inputNum = Integer.parseInt(scanner.nextLine());
//            myArr[i] = inputNum;
//        }
//        sortASC(myArr);
//        show(myArr);
//        System.out.println(binarySearch(myArr,5,10,7));
        System.out.println(binarySearch(list,50,5,13));
    }
}
