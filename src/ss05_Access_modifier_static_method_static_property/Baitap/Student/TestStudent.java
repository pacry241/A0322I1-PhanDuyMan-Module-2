package ss05_Access_modifier_static_method_static_property.Baitap.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setClasses("12");
        obj1.setName("Hung");
        Student obj2 = new Student();
        System.out.println(obj2);
        System.out.println(obj1);
    }
}
