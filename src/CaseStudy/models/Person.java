package CaseStudy.models;

public abstract class Person {
    private String name;
    private boolean gender;
    private String dateOfBirth;
    private String email;
    private String CMND;
    private String sdt;

    public  Person(){};

    public Person(String name, boolean gender, String dateOfBirth, String email, String CMND, String sdt) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.CMND = CMND;
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", CMND=" + CMND +
                ", sdt=" + sdt + " ";
    }
}

