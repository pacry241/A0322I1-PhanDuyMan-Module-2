package bai_thi.models;

import java.util.Scanner;

public class SanPhamNhap extends SanPham{
    private int giaNhap;
    private String noiNhap;
    private String thueNhap;

    public SanPhamNhap(int id, String ten, String ma_sp, double giaBan, String sanXuat, double giaNhap, String noinhap, String thue) {
    }


    public SanPhamNhap(int giaNhap, String noiNhap, String thueNhap) {
        this.giaNhap = giaNhap;
        this.noiNhap = noiNhap;
        this.thueNhap = thueNhap;
    }

    public SanPhamNhap(int id, String ma_sp, String ten, int giaBan, int soluong, String sanXuat, int giaNhap, String noiNhap, String thueNhap) {
        super(id, ma_sp, ten, giaBan, soluong, sanXuat);
        this.giaNhap = giaNhap;
        this.noiNhap = noiNhap;
        this.thueNhap = thueNhap;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getNoiNhap() {
        return noiNhap;
    }

    public void setNoiNhap(String noiNhap) {
        this.noiNhap = noiNhap;
    }

    public String getThueNhap() {
        return thueNhap;
    }

    public void setThueNhap(String thueNhap) {
        this.thueNhap = thueNhap;
    }

    @Override
    public String toString() {
        return "SanPhamXuatKhau{" + super.toString()+
                "giaNhap=" + giaNhap +
                ", noiNhap='" + noiNhap + '\'' +
                ", thueNhap='" + thueNhap + '\'' +
                '}';
    }
}
