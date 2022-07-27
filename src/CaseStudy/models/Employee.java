package CaseStudy.models;

public class Employee  extends Person{
    private int ID;
    private String level;
    private String office;
    private double wage;

    public Employee(){};

    public Employee(String name, boolean gender, String dateOfBirth, String email, String CMND, String sdt, int ID, String level, String office, double wage) {
        super(name, gender, dateOfBirth, email, CMND, sdt);
        this.ID = ID;
        this.level = level;
        this.office = office;
        this.wage = wage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "{" +super.toString()+
                "ID=" + ID +
                ", academicLevel='" + level + '\'' +
                ", office='" + office + '\'' +
                ", wage=" + wage +
                '}';
    }
}
