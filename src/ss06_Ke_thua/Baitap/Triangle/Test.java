package ss06_Ke_thua.Baitap.Triangle;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4,3,5);
        System.out.println(triangle);
        System.out.println("Perimeter: "+triangle.getPerimeter());
        System.out.println("Area: "+triangle.getArea());
    }
}
