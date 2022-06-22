package ss06_Ke_thua.Baitap.Point_vs_MoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed =0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);

    }

    public float[] getSpeed(){
        float[] newArr = {getXSpeed(),getYSpeed()};
        return newArr;
    }

    public void move(){
        setX(getX()+getXSpeed());
        setY(getY()+getYSpeed());
    }

    @Override
    public String toString() {
        return "(" +
                "x=" + getX() +
                ", y=" + getY() +
                "), speed =" +
                "(xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ')';
    }
}
