package ss07_AbstractClass_Interface.Bt.Colorable;

public class Square extends Shape implements Colorable{
    private double side;

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public Square(){}

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea(){
        return Math.pow(getSide(),2);
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
