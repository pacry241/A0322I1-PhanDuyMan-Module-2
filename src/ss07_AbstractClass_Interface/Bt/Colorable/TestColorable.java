package ss07_AbstractClass_Interface.Bt.Colorable;
import java.util.Random;

public class TestColorable {
    public static void main(String[] args) {
        Shape arr[] = new Shape[8];
        arr[0] = new Rectangle(6,5);
        arr[1] = new Rectangle(9,4);
        arr[2] = new Circle(5.5);
        arr[3] = new Rectangle(22,8);
        arr[4] = new Square(6.5);
        arr[5] = new Circle(53.5);
        arr[6] = new Square(4);
        arr[7] = new Circle(3);

        for (Shape arrs: arr){
            System.out.println(arrs.toString());
            System.out.println("Area: "+arrs.getArea());
            if(arrs instanceof Square){
                ((Square) arrs).howToColor();
            }
            System.out.println("------------------------------------------------");
        }
    }
}
