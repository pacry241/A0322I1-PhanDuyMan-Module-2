package ss01_Introduction_Java.Bai_tap.number_reading_app;
import java.util.Scanner;

public class MainNumberReading {
    final static String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};
    final static String twos[] = {" ", " ", " TWENTY", " THIRTY", " FORTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
    private static void numberToWord(int num, String val) {
        System.out.print(num > 19 ? twos[num / 10] + " " + ones[num % 10] : ones[num]);
        System.out.print(num > 0 ? val : "");
    }
    public static void main(String[] args) {
        System.out.print("Input a number:");
        int num = new Scanner(System.in).nextInt();
        numberToWord(((num / 100) % 10), " HUNDRED AND");
        numberToWord((num % 100), " ");

    }
}
