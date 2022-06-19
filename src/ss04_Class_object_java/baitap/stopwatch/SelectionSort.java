package ss04_Class_object_java.baitap.stopwatch;
import java.util.Random;
public class SelectionSort {
    public void sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Nếu arr[i] > arr[j] thì hoán đổi giá trị của arr[i] và arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random number = new Random();
        StopWatch time = new StopWatch();
        SelectionSort obj1 = new SelectionSort();

        int[] array = new int[100000];
        //gán 100000 giá trị ngẫu nhiên
        for (int i =0;i< array.length;i++){
            int ranNum = number.nextInt(100000)+1;
            array[i] = ranNum;
        }
        time.start();
        obj1.sort(array);
        time.end();
        System.out.println("after Selection Sort 100000 about: "+time.getElapsedTime()+" mili second");
    }

}
