package ss04_Class_object_java.baitap.Fan;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        String speedOfFan = null;
        switch (getSpeed()){
            case 1:
                speedOfFan = "LOW";
                break;
            case 2:
                speedOfFan = "NORMAL";
                break;
            case 3:
                speedOfFan = "FAST";
                break;
        }
        if(isOn()){
            return "Fan have speed: "+speedOfFan+" and radius: "+getRadius()+" and color: "+getColor()
                    +"- Fan is ON";
        }else{
            return "Fan have radius: "+getRadius()+" and color: "+getColor() +"- Fan is Off";
        }
    }

}
