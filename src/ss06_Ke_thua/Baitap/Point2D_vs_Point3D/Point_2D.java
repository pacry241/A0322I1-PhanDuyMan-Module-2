package ss06_Ke_thua.Baitap.Point2D_vs_Point3D;

public class Point_2D {
    private float x;
    private float y;

    public Point_2D(){
        this.x= 0.0f;
        this.y=0.0f;
    }

    public Point_2D(float x, float y){
        this.y = y;
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] arr = {getX(),getY()} ;
        return arr;
    }
    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "Point_2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
