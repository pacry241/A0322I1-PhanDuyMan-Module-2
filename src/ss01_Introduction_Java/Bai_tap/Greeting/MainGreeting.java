package ss01_Introduction_Java.Bai_tap.Greeting;
import java.util.Scanner;
public class MainGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}
