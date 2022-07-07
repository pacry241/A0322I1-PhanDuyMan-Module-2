package CaseStudy.models;
import CaseStudy.Repository.Level;
import CaseStudy.Repository.Office;

import java.util.Date;

public class Employee  extends Person{
    private long codeEmployee;
    private  Level academicLevel;
    private Office office;
    private double wage;



    public Employee(){};

    public Employee(long codeEmployee, Level academicLevel,Office office, double wage) {
        this.codeEmployee = codeEmployee;
        this.academicLevel = academicLevel;
        this.office = office;
        this.wage = wage;
    }

    public Employee(String fullName, String gender, String dateOfBirth, String email, long numCCCD, long phoneNumber, Level academicLevel, Office office, double wage) {
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
    }
}
