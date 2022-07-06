package CaseStudy.models;

import java.util.Date;

public class Employee  extends Person{
    private long codeEmployee;
    private Level academicLevel;
    private Office office;
    private double wage;

    enum Office{
        Reception,
        Service,
        Experts,
        Personnel,
        Manager,
        President


    }
    enum Level{
        TrungCap,
        CaoDang,
        DaiHoc,
        SauDaiHoc
    }
    public Employee(){};

    public Employee(long codeEmployee, Level academicLevel,Office office, double wage) {
        this.codeEmployee = codeEmployee;
        this.academicLevel = academicLevel;
        this.office = office;
        this.wage = wage;
    }

    public Employee(String fullName, String gender, Date dateOfBirth, String email, int numCCCD, int phoneNumber, long codeEmployee, Level academicLevel, Office office, double wage) {
        super(fullName, gender, dateOfBirth, email, numCCCD, phoneNumber);
        this.codeEmployee = codeEmployee;
        this.academicLevel = academicLevel;
        this.office = office;
        this.wage = wage;
    }

    public long getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(long codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public Level getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(Level academicLevel) {
        this.academicLevel = academicLevel;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
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
        return "Employee{" +
                "codeEmployee=" + codeEmployee +
                ", academicLevel=" + academicLevel +
                ", office='" + office + '\'' +
                ", wage=" + wage +
                '}'+super.toString();
    }

    public static void main(String[] args) {
        Employee obj = new Employee(2132156465,Level.DaiHoc,Office.Service,1232233);
        obj.setPhoneNumber(1222);
        System.out.println(obj);
    }
}
