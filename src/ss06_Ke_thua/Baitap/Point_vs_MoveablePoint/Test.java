package ss06_Ke_thua.Baitap.Point_vs_MoveablePoint;

public class Test {
    public static void main(String[] args) {
        MoveablePoint obj = new MoveablePoint(1,3,5,8);
        System.out.println(obj);
        obj.move();
        System.out.println(obj);
    }
}
