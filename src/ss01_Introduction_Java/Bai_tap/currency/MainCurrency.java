package ss01_Introduction_Java.Bai_tap.currency;
import java.util.Scanner;
public class MainCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        double Usd, Vnd;
        System.out.println("Nhập số tiền cần chuyển đổi: ");
        Usd = scanner.nextDouble();
        Vnd = Usd*rate;
        System.out.print("Số tiền chuyển đổi là " + Vnd + "Đồng");
    }
}
