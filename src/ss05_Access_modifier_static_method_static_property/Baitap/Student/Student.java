package ss05_Access_modifier_static_method_static_property.Baitap.Student;

public class Student {
    private String name;
    private String classes;

    public Student(){
        this.name = "John";
        this.classes= "CO2";
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes=classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
