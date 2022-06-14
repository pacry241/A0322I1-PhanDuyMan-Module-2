package ss02_Loop_Java.Baitap.Drawing_geometry;
import java.util.Scanner;
public class MainGeometry {
    public static void DrawingRectangle(int a,int b){
        for (int i = 1; i<=a ; i++) {
            for(int j = 1; j<=b; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void DrawingSquareTriangle(int h){
        for(int i = 1; i<= h; i++){
            for (int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void DrawingIsosceles(int h){
        int k =0;
        for (int i = 1; i <= h; ++i, k = 0) {
            for (int space = 1; space <= h - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int choice = -1;
        int a;
        int b;
        int h;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter length a: ");
                    a = input.nextInt();
                    System.out.println("Enter width b: ");
                    b = input.nextInt();
                    DrawingRectangle(a,b);
                    break;
                case 2:
                    System.out.println("Enter height h: ");
                    h= input.nextInt();
                    DrawingSquareTriangle(h);
                    break;
                case 3:
                    System.out.println("Enter height h: ");
                    h= input.nextInt();
                    DrawingIsosceles(h);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
            }
        }
}
