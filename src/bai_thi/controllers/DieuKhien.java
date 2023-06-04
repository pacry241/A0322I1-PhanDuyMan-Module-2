package bai_thi.controllers;

import bai_thi.service.SanPhamNhap;
import bai_thi.service.SanPhamNhapImpl;
import bai_thi.service.SanPhamXuat;
import bai_thi.service.SanPhamXuatImpl;

import java.util.Scanner;

public class DieuKhien {
    private static Scanner scanner = new Scanner(System.in);
    private static SanPhamXuat sanPhamXuat = new SanPhamXuatImpl();
    private static SanPhamNhap sanPhamNhap = new SanPhamNhapImpl();
    public void Menu_Chinh(){
        System.out.println("Chon mot trong nhung lua chon sau:  ");
        System.out.println("1.\t San pham suat khau : ");
        System.out.println("2.\t San pham nhap khau : ");
        System.out.println("3.\t Thoat");
        boolean check1 = true;
        int chose1 = Integer.parseInt(scanner.nextLine());
        while (check1){
            switch (chose1){
                case 1:
                    Menu_San_Pham_Xuat();
                    break;
                case 2:
                    Menu_San_Pham_Nhap();
                    break;
                default:
                    Menu_Chinh();
            }
        }
    }

    public void Menu_San_Pham_Xuat(){
        System.out.println("Lua chon:");
        System.out.println("1.\t Hien thi");
        System.out.println("2.\t Them moi san pham");
        System.out.println("3.\t Xoa");
        System.out.println("4.\t Tim kiem");
        System.out.println("5.\t thoat");
        boolean check = true;
        int chose = Integer.parseInt(scanner.nextLine());
        while (check){
            switch (chose){
                case 1:
                    sanPhamXuat.hienthi();
                    check = false;
                    break;
                case 2:
                    sanPhamXuat.them();
                    check = false;
                    break;
                case 3:
                    sanPhamXuat.xoaSanPham();
                    check = false;
                    break;
                case 4:
                    sanPhamXuat.timkiemXuat();
                    check = false;
                    break;
                default:
                    check = false;
                    break;
            }
        }
    }

    public  void Menu_San_Pham_Nhap(){
        System.out.println("Lua chon:");
        System.out.println("1.\t Hien thi");
        System.out.println("2.\t Them moi san pham");
        System.out.println("3.\t Xoa");
        System.out.println("4.\t Tim kiem");
        System.out.println("5.\t thoat");
        boolean check = true;
        int chose = Integer.parseInt(scanner.nextLine());
        while (check){
            switch (chose){
                case 1:
                    sanPhamNhap.hienThi();
                    check = false;
                    break;
                case 2:
                    sanPhamNhap.them();
                    check = false;
                    break;
                case 3:
                    sanPhamNhap.xoaSanPham();
                    check = false;
                    break;
                case 4:
                    sanPhamNhap.timkiemNhap();
                    check = false;
                    break;
                default:
                    check = false;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        DieuKhien dieuKhien = new DieuKhien();
        dieuKhien.Menu_Chinh();
    }

}
