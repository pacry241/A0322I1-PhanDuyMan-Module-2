package ss04_Class_object_java.baitap.phuongtrinhbac2;
import java.util.Scanner;
public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return Math.pow(this.getB(),2)-4*this.getA()*this.getC();
    }

    public double getRoot1() {
        return (-this.getB()-Math.sqrt(Math.pow(this.getB(),2)-4*this.getA()*this.getC())/2/this.getA());
    }

    public double getRoot2() {
        return (-this.getB()+Math.sqrt(Math.pow(this.getB(),2)-4*this.getA()*this.getC())/2/this.getA());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a = ");
        double a = input.nextDouble();
        System.out.println("Enter b = ");
        double b = input.nextDouble();
        System.out.println("Enter c = ");
        double c = input.nextDouble();

        QuadraticEquation Test1 = new QuadraticEquation(a,b,c);
        double delta = Test1.getDiscriminant();

        if (delta >0 ){
            System.out.println("Nghiệm x1: "+ Test1.getRoot1());
            System.out.println("Nghiệm x2: "+ Test1.getRoot2());
        }else if (delta ==0){
            System.out.println("Nghiệm kép x = "+ Test1.getRoot2());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
