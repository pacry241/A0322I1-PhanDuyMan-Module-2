package CaseStudy.controllers;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    private int soTang;


    public Villa(){};

    public Villa(String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                '}'+ super.toString();
    }


    @Override
    public String nameService(String name) {
        return name;
    }

    @Override
    public void areaService(double dai , double rong) {
        System.out.println(dai*rong);
    }

    @Override
    public void costRentService(int nguoi) {

    }

    @Override
    public void amountMaxPerson() {

    }

    @Override
    public void timeRent() {

    }

    public static void main(String[] args) {
        Villa villa = new Villa();
    }
}
