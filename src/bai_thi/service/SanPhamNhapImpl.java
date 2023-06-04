package bai_thi.service;

import bai_thi.models.SanPham;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SanPhamNhapImpl extends SanPham implements SanPhamNhap{

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
        System.out.println("Nhap gia nhap khau: ");
        int gianhap = Integer.parseInt(scanner.nextLine());
        System.out.println("Noi nhap khau: ");
        String noinhap = scanner.nextLine();
        System.out.println("Thue nhap: ");
        String thue = scanner.nextLine();
        if (mySp.isEmpty()){
            id = 1;
        }else {
            id = mySp.size()+1;
        }
        SanPham sanPhamNhap = new bai_thi.models.SanPhamNhap(id,ma_sp,ten,soluong,giaBan,sanXuat,gianhap,noinhap,thue);

        mySp.add(sanPhamNhap);
        System.out.println("Them thanh cong");
    }

    @Override
    public void hienThi() {
        for (SanPham value : mySp){
            System.out.println(value);
        }
    }

    @Override
    public void timkiemNhap() {
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


    }


}
