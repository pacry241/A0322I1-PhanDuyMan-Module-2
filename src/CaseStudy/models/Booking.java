package CaseStudy.models;
import java.util.Date;
public class Booking {
    private int codeBooking;
    private Date startDate;
    private Date endDate;
    private int IDcustom;
    private String namService;
    private String tenDichvu;
    public Booking(){}

    public Booking(int codeBooking, Date startDate, Date endDate, int IDcustom, String namService, String tenDichvu) {
        this.codeBooking = codeBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.IDcustom = IDcustom;
        this.namService = namService;
        this.tenDichvu = tenDichvu;
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getIDcustom() {
        return IDcustom;
    }

    public void setIDcustom(int IDcustom) {
        this.IDcustom = IDcustom;
    }

    public String getNamService() {
        return namService;
    }

    public void setNamService(String namService) {
        this.namService = namService;
    }

    public String getTenDichvu() {
        return tenDichvu;
    }

    public void setTenDichvu(String tenDichvu) {
        this.tenDichvu = tenDichvu;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking=" + codeBooking +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", IDcustom=" + IDcustom +
                ", namService='" + namService + '\'' +
                ", tenDichvu='" + tenDichvu + '\'' +
                '}';
    }
}
