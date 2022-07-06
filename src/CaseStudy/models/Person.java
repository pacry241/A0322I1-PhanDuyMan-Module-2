package CaseStudy.models;
import java.util.Date;
public abstract class Person {
    private String fullName;
    private String gender;
    private Date dateOfBirth;
    private String email;
    private long numCCCD;
    private long phoneNumber;

    public  Person(){};

    public Person(String fullName, String gender, Date dateOfBirth, String email, int numCCCD, int phoneNumber) {
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.numCCCD = numCCCD;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumCCCD() {
        return numCCCD;
    }

    public void setNumCCCD(int numCCCD) {
        this.numCCCD = numCCCD;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", numCCCD=" + numCCCD +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

