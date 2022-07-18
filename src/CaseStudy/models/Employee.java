package CaseStudy.models;

public class Employee  extends Person{
    private int codeEmployee;
    private String academicLevel;
    private String office;
    private double wage;



    public Employee(){};

    public Employee(int codeEmployee, String academicLevel, String office, double wage) {
        this.codeEmployee = codeEmployee;
        this.academicLevel = academicLevel;
        this.office = office;
        this.wage = wage;
    }

    public Employee(String fullName, String gender, String dateOfBirth, String email, long numCCCD, long phoneNumber,int codeEmployee, String academicLevel, String office, double wage) {
        super(fullName, gender, dateOfBirth, email, numCCCD, phoneNumber);
        this.codeEmployee = codeEmployee;
        this.academicLevel = academicLevel;
        this.office = office;
        this.wage = wage;
    }

    public long getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(int codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public java.lang.String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(java.lang.String academicLevel) {
        this.academicLevel = academicLevel;
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
    public java.lang.String toString() {
        return "Employee{" +
                "codeEmployee=" + codeEmployee +
                ", academicLevel=" + academicLevel +
                ", office='" + office + '\'' +
                ", wage=" + wage +
                '}'+super.toString();
    }

    public static void main(java.lang.String[] args) {
    }
}
