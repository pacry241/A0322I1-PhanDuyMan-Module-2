package ss06_Ke_thua.Baitap.Point2D_vs_Point3D;

import java.util.Arrays;

public class Point_2D_Test {
    public static void main(String[] args) {
        Point_2D obj = new Point_2D(5,6);
        System.out.println(obj);
        obj.setXY(7,8);
        System.out.println(obj);
        System.out.println(Arrays.toString(obj.getXY()));

        Point_3D obj1 = new Point_3D(1,2,3);
        System.out.println(obj1);
        System.out.println(Arrays.toString(obj1.getXYZ()));
    }
}
