import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập");
        int input = scanner.nextInt();
        int[] arr = {1,2,3,4};
        int check =0;
        String[] arr1 = {"a", "b","c","d"};
        for (int i = 0 ; i< arr.length;i++){
            if (arr[i] == input){
                System.out.println(arr[i]);
                check = i;;
                break;
            }
        }
        for (int j = 0;j<arr1.length;j++){
            if (j == arr[check]){
                System.out.println(arr1[j]);
            }
        }
    }
}
