package baithi2.service.impl;

import baithi2.model.TaiKhoanThanhToan;
import baithi2.service.ITaiKhoanNganHangService;
import baithi2.utils.DocGhiFileTaiKhoanThanhToan;

import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanService implements ITaiKhoanNganHangService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String path = "D:\\Codegym\\Mudule2\\A0322I1-PhanDuyMan-Module-2\\src\\baithi2\\data\\TaiKhoanThanhToan.csv";
    @Override
    public void them() {
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = DocGhiFileTaiKhoanThanhToan.docFileThanhToan(path);
        TaiKhoanThanhToan taiKhoanThanhToan = nhapThongTin();
        taiKhoanThanhToanList.add(taiKhoanThanhToan);
        DocGhiFileTaiKhoanThanhToan.docFileThanhToan(path);
        System.out.println("Thêm tài khoản thanh toán thành công");
    }

    @Override
    public void xoa() {
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = DocGhiFileTaiKhoanThanhToan.docFileThanhToan(path);
        boolean kiemTra = false;
        if(taiKhoanThanhToanList.isEmpty()){
            System.out.println("Danh sách tài khoản thanh toán đang trống");
        }else {
            System.out.print("Nhập id tài khoản bạn cần xóa :");
            int idXoa = Integer.parseInt(SCANNER.nextLine());
            for (TaiKhoanThanhToan taikhoanThanhToan:taiKhoanThanhToanList) {
                if(taikhoanThanhToan.getIdTaiKhoan()==idXoa){
                    System.out.println("Bạn có muốn xóa tài khoản có id "+idXoa+" có chủ tài khoản là "
                            +taikhoanThanhToan.getTenChuTaiKhoan()+ " không ?");
                    System.out.println("1.Có");
                    System.out.println("2.Không");
                    System.out.print("Nhập lựa chọn của bạn :");
                    int luaChon = Integer.parseInt(SCANNER.nextLine());
                    if(luaChon==1){
                        taiKhoanThanhToanList.remove(taikhoanThanhToan);
                        DocGhiFileTaiKhoanThanhToan.docFileThanhToan(path);
                        kiemTra= true;
                        System.out.println("Xóa thành công");
                        System.out.println("Danh sách tài khoản thanh toán sau khi xóa");
                        hienThi();
                        break;
                    }else if(luaChon==2){
                        kiemTra=true;
                        break;
                    }
                }
            }
            if(!kiemTra){
                System.out.println("Không tìm thấy tài khoản thanh toán có id là "+idXoa);
            }
        }
    }

    @Override
    public void hienThi() {
        List<TaiKhoanThanhToan> ttaiKhoanThanhToanList = DocGhiFileTaiKhoanThanhToan.docFileThanhToan(path);
        if (ttaiKhoanThanhToanList.isEmpty()) {
            System.out.println("Danh sách tài khoản thanh toán đang trống");
        } else {
            for (TaiKhoanThanhToan taiKhoanThanhToan : ttaiKhoanThanhToanList) {
                System.out.println(taiKhoanThanhToan);
            }
        }
    }

    @Override
    public void timKiem() {
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = DocGhiFileTaiKhoanThanhToan.docFileThanhToan(path);
        boolean kiemTra = false;
        if(taiKhoanThanhToanList.isEmpty()){
            System.out.println("Danh sách tài khoản thanh toán đang trống");
        }else {
            System.out.print("Nhập id tài khoản bạn cần tìm :");
            int idTimKiem = Integer.parseInt(SCANNER.nextLine());
            for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList) {
                if(taiKhoanThanhToan.getIdTaiKhoan()==idTimKiem){
                    System.out.println("Tài khoản có id "+idTimKiem+" là "+taiKhoanThanhToan);
                    kiemTra= true;
                    break;
                }
            }
            if(!kiemTra){
                System.out.println("Không tìm thấy tài khoản thanh toán có id "+ idTimKiem);
            }
        }
    }
    public TaiKhoanThanhToan nhapThongTin(){
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = DocGhiFileTaiKhoanThanhToan.docFileThanhToan(path);
        int idTaiKhoan;
        String maTaiKhoan;
        String tenChuTaiKhoan;
        String ngayTaoTaiKhoan;
        int soThe;
        double soTienTrongTaiKhoan;


        if(taiKhoanThanhToanList.isEmpty()){
            idTaiKhoan = 1;
        }else{
            idTaiKhoan = taiKhoanThanhToanList.get(taiKhoanThanhToanList.size()-1).getIdTaiKhoan()+1;
        }
        System.out.println("Id của tài khoản này là : "+idTaiKhoan);

        System.out.print("Nhập mã tài khoản tài khoản :");
        maTaiKhoan=SCANNER.nextLine();

        System.out.print("Nhập tên chủ tài khoản :");
        tenChuTaiKhoan=SCANNER.nextLine();

        System.out.print("Nhập ngày tạo tài khoản :");
        ngayTaoTaiKhoan=SCANNER.nextLine();

        System.out.print("Nhập số thẻ tài khoản :");
        soThe=Integer.parseInt(SCANNER.nextLine());

        System.out.print("Nhập số tiền trong tài khoản :");
        soTienTrongTaiKhoan = Double.parseDouble(SCANNER.nextLine());


        return new TaiKhoanThanhToan(idTaiKhoan,maTaiKhoan,tenChuTaiKhoan,ngayTaoTaiKhoan,soThe,soTienTrongTaiKhoan);
    }

}
