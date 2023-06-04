package ontap.bt.model;

public class Teacher extends Person implements Comparable<Teacher> {
    private String specialist;

    public Teacher() {
    }

    public Teacher(String specialist) {
        this.specialist = specialist;
    }

    public Teacher(int id, String name, String dateOfBirth, String sex, String specialist) {
        super(id, name, dateOfBirth, sex);
        this.specialist = specialist;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+
                "specialist='" + specialist + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String getInfor() {
        return String.format("%d,%s,%s,%s,%s\n",this.getId(),this.getName(),this.getDateOfBirth(),this.getSex(),this.getSpecialist());
    }
}
