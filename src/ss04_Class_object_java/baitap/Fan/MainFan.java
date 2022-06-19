package ss04_Class_object_java.baitap.Fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan(2,false,5,"blue");

        System.out.println(fan1);
        System.out.println(fan2);
    }
}
