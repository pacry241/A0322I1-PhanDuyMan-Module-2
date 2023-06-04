package bai_thi.models;

abstract public class SanPham {
    private int id;
    private String ma_sp;
    private String ten;
    private int giaBan;
    private int soluong;
    private String sanXuat;

    public SanPham() {
    }

    public SanPham(int id, String ma_sp, String ten, int giaBan, int soluong, String sanXuat) {
        this.id = id;
        this.ma_sp = ma_sp;
        this.ten = ten;
        this.giaBan = giaBan;
        this.soluong = soluong;
        this.sanXuat = sanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa_sp() {
        return ma_sp;
    }

    public void setMa_sp(String ma_sp) {
        this.ma_sp = ma_sp;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getSanXuat() {
        return sanXuat;
    }

    public void setSanXuat(String sanXuat) {
        this.sanXuat = sanXuat;
    }



    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", ma_sp='" + ma_sp + '\'' +
                ", ten='" + ten + '\'' +
                ", giaBan=" + giaBan +
                ", soluong=" + soluong +
                ", sanXuat='" + sanXuat + '\'' +
                '}';
    }
}
