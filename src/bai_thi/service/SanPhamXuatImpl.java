package bai_thi.service;

import bai_thi.models.SanPham;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SanPhamXuatImpl extends SanPham implements SanPhamXuat {

    private static List<SanPham> mySp = new LinkedList<>();
    @Override
    public void them() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.println("Nhap so luong: ");
        int soluong = Integer.parseInt(scanner.nextLine());
        System.out.println("Ma san pham: ");
        String ma_sp = scanner.nextLine();
        System.out.println("Nhap gia ban: ");
        int giaBan = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap noi san xuat: ");
        String sanXuat = scanner.nextLine();
        System.out.println("Nhap gia xuat khau: ");
        int giaxuat = Integer.parseInt(scanner.nextLine());

        System.out.println("Nuoc nhap :  ");
        String nuocnhap = scanner.nextLine();
        if (mySp.isEmpty()){
            id = 1;
        }else {
            id = mySp.size()+1;
        }
        SanPham sanPhamXuatKhau = new bai_thi.models.SanPhamXuat(id,ma_sp,ten,giaBan,soluong,sanXuat,giaxuat,nuocnhap);
        mySp.add(sanPhamXuatKhau);
        System.out.println("Them thanh cong san pham");

    }

    @Override
    public void hienthi() {
       for (SanPham sanPham : mySp){
           System.out.println(sanPham);
       }
    }

    @Override
    public void timkiemXuat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten san pham");
        String ten  = scanner.nextLine();
        System.out.println("Nhap Ma san pham: ");
        String ma_sp = scanner.nextLine();
        int index = 0;
        for (SanPham sanPham : mySp){
            if (sanPham.getTen()==ten && sanPham.getMa_sp()==ma_sp){
                System.out.println(sanPham);
                break;
            }
        }
    }

    @Override
    public void xoaSanPham() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten san pham");
        String ten  = scanner.nextLine();
        System.out.println("Nhap Ma san pham: ");
        String ma_sp = scanner.nextLine();
        int index = 0;
        for (SanPham sanPham : mySp){
            if (sanPham.getTen()==ten && sanPham.getMa_sp()==ma_sp){
                index = mySp.indexOf(sanPham);
                System.out.println("Ban co muon xoa khong?");
                System.out.println("1.\t Co");
                System.out.println("2.\t Khong");
                int chose = Integer.parseInt(scanner.nextLine());
                if (chose ==1){
                    mySp.remove(index);
                    System.out.println("Da xoa san pham");
                }
                if (chose==2){
                    mySp.remove(index);
                }
                break;
            }
        }
        System.out.println("Ban co muon xoa khong?");
        System.out.println("1.\t Co");
        System.out.println("2.\t Khong");
        int chose = Integer.parseInt(scanner.nextLine());
        if (chose ==1){
            mySp.remove(index);
            System.out.println("Da xoa san pham");
        }
        if (chose==2){
            mySp.remove(index);
        }

    }
}
