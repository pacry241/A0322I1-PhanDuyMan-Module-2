package ss06_Ke_thua.Baitap.Point2D_vs_Point3D;

public class Point_3D extends Point_2D {
    private float z;

    public Point_3D(){
        this.z = 0.0f;
    }

    public Point_3D(float z) {
        this.z = z;
    }

    public Point_3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ(){
        float[] arr = {getX(),getY(),getZ()};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }
}
