package ss13_thuat_toan_tim_kiem.bt.tim_chuoi_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String inputString = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i< inputString.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(inputString.charAt(i));
            for (int j = i+1;j<inputString.length();j++){
                if (inputString.charAt(j)> list.getLast()){
                    list.add(inputString.charAt(j));
                }
            }

            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch : max){
            System.out.println(ch);
        }
        System.out.println();

    }


}
