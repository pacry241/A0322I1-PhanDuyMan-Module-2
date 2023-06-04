package bai_thi.models;

import java.util.Scanner;

public class SanPhamXuat extends SanPham {
    private int giaXuat;
    private String nuocNhap;

    public SanPhamXuat() {
    }


    public SanPhamXuat(int giaXuat, String nuocNhap) {
        this.giaXuat = giaXuat;
        this.nuocNhap = nuocNhap;
    }

    public SanPhamXuat(int id, String ma_sp, String ten, int giaBan, int soluong, String sanXuat, int giaXuat, String nuocNhap) {
        super(id, ma_sp, ten, giaBan, soluong, sanXuat);
        this.giaXuat = giaXuat;
        this.nuocNhap = nuocNhap;
    }

    public int getGiaXuat() {
        return giaXuat;
    }

    public void setGiaXuat(int giaXuat) {
        this.giaXuat = giaXuat;
    }

    public String getNuocNhap() {
        return nuocNhap;
    }

    public void setNuocNhap(String nuocNhap) {
        this.nuocNhap = nuocNhap;
    }

    @Override
    public String toString() {
        return "SanPhamXuat{" +super.toString()+
                "giaXuat=" + giaXuat +
                ", nuocNhap='" + nuocNhap + '\'' +
                '}';
    }
}
