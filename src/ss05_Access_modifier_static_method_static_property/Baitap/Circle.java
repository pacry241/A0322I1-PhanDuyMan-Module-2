package ss05_Access_modifier_static_method_static_property.Baitap;

public class Circle {
    private double radius;
    private String color;

    public Circle(){}

    public Circle(double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    protected double getArea(){
        return Math.pow(this.radius,2)*3.14;
    }
}
