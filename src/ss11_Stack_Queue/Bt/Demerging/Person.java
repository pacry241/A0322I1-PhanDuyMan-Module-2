package ss11_Stack_Queue.Bt.Demerging;

public class Person {
    private String name;
    public static final boolean NAM = true, NU =false;
    private boolean gioiTinh;
    private String ngaySinh;

    public Person(){};

    public Person(String name, boolean gioiTinh, String ngaySinh) {
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public String getGioiTinh(){
        if(isGioiTinh())return "NAM";
        else return "NU";
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", gioiTinh=" + getGioiTinh() +
                ", ngaySinh='" + ngaySinh + '\'' +
                '}';
    }
}
