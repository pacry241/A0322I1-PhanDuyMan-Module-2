package baithi2.model;

public class TaiKhoanTietKiem extends TaiKhoanNganHang {
    private double tienGuiTietKiem;
    private String ngayGuiTietkiem;
    private double laiSuat;
    private int kiHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(int tienGuiTietKiem, String ngayGuiTietkiem, double laiSuat, int kiHan) {
        this.tienGuiTietKiem = tienGuiTietKiem;
        this.ngayGuiTietkiem = ngayGuiTietkiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public TaiKhoanTietKiem(int idTaiKhoan, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, double tienGuiTietKiem, String ngayGuiTietkiem, double laiSuat, int kiHan) {
        super(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.tienGuiTietKiem = tienGuiTietKiem;
        this.ngayGuiTietkiem = ngayGuiTietkiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public double getTienGuiTietKiem() {
        return tienGuiTietKiem;
    }

    public void setTienGuiTietKiem(double tienGuiTietKiem) {
        this.tienGuiTietKiem = tienGuiTietKiem;
    }

    public String getNgayGuiTietkiem() {
        return ngayGuiTietkiem;
    }

    public void setNgayGuiTietkiem(String ngayGuiTietkiem) {
        this.ngayGuiTietkiem = ngayGuiTietkiem;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" + super.toString()+
                "tienGuiTietKiem=" + tienGuiTietKiem +
                ", ngayGuiTietkiem='" + ngayGuiTietkiem + '\'' +
                ", laiSuat=" + laiSuat +
                ", kiHan='" + kiHan + '\'' +
                '}';
    }

    @Override
    public String getInfor() {
        return String.format("%d,%s,%s,%s,%f,%s,%f,%d\n",this.getIdTaiKhoan(),this.getMaTaiKhoan(),this.getTenChuTaiKhoan(),this.getNgayTaoTaiKhoan(),this.getTienGuiTietKiem(),this.getNgayGuiTietkiem(),this.getLaiSuat(),this.getKiHan());
    }


}
