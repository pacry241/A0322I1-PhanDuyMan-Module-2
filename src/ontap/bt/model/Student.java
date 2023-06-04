package ontap.bt.model;

public class Student extends Person implements Comparable<Student>{
    private String classname;
    private double score;

    public Student() {
    }

    @Override
    public String getInfor() {
        return String.format("%d,%s,%s,%s,%s,%f\n",this.getId(),this.getName(),this.getDateOfBirth(),this.getSex(),this.getClassname(),this.getScore());
    }

    public Student(String classname, double score) {
        this.classname = classname;
        this.score = score;
    }

    public Student(int id, String name, String dateOfBirth, String sex, String classname, double score) {
        super(id, name, dateOfBirth, sex);
        this.classname = classname;
        this.score = score;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "classname='" + classname + '\'' +
                ", score=" + score +
                '}';
    }
}
