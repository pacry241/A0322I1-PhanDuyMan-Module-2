package ss06_Ke_thua.Baitap.Circle_vs_Cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){}

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}'+ super.toString();
    }
}
