package ss07_AbstractClass_Interface.Bt.Resizeable;
import java.util.Random;

public class TestResizeable {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[5];
        shapes[0] = new Rectangle(3,1);
        shapes[1] = new Rectangle(6,8);
        shapes[2] = new Circle(5);
        shapes[3] = new Rectangle(21,6);
        shapes[4] = new Circle(6.5);

        Random random = new Random();

        for (Shape shape: shapes){
            System.out.println(shape.toString());
            int ranNum = random.nextInt(100)+1;
            System.out.println("Percent up shape is ");
            shape.resize(ranNum);
            System.out.println("After up "+ranNum+"% shape have ");
            System.out.println(shape.toString());
            System.out.println("------------------------------------------------");
        }
    }
}
