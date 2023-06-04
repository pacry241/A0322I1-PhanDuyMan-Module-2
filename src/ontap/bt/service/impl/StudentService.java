package ontap.bt.service.impl;

import ontap.bt.model.Student;
import ontap.bt.service.IPersonService;
import ontap.bt.service.IStudentService;
import ontap.bt.utils.ReadWriteFileStudent;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IPersonService, Comparator<Student> {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "D:\\Codegym\\Mudule2\\A0322I1-PhanDuyMan-Module-2\\src\\ontap\\bt\\data\\student.csv";

    @Override
    public void add() {
        List<Student> studentList = ReadWriteFileStudent.readFileStudent(PATH);
        Student student = enterInForStudent();
        studentList.add(student);
        ReadWriteFileStudent.writeFileStudent(PATH, studentList);
        System.out.println("Thêm thành công học viên vào danh sách");
    }

    @Override
    public void remove() {
        List<Student> studentList = ReadWriteFileStudent.readFileStudent(PATH);
        int idFind;
        boolean check = false;
        if (studentList.isEmpty()) {
            System.out.println("Danh sách học viên đang trống");
        } else {
            System.out.print("Nhập id của học viên bạn cần xóa :");
            idFind = Integer.parseInt(SCANNER.nextLine());
            for (Student student : studentList) {
                if (student.getId() == idFind) {
                    System.out.println("Bạn có chắn chắn xóa học viên có id " + idFind + " là " + student.getName() + " không ?");
                    System.out.println("1.Có");
                    System.out.println("2.Không");
                    System.out.print("Nhập lựa chọn bạn muốn:");
                    int chooseYesNo = Integer.parseInt(SCANNER.nextLine());
                    if (chooseYesNo == 1) {
                        studentList.remove(student);
                        ReadWriteFileStudent.writeFileStudent(PATH, studentList);
                        check = true;
                        System.out.println("Đã xóa thành công");
                        break;
                    } else {
                        check = true;
                        break;
                    }

                }
            }
            if (!check) {
                System.out.println("Không tìm thấy học viên có id " + idFind + " này?");
            }
        }


    }

    @Override
    public void disPlay() {
        List<Student> studentList = ReadWriteFileStudent.readFileStudent(PATH);
        if (studentList.isEmpty()) {
            System.out.println("Danh sách học viên đang trống");
        }
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    @Override
    public void sort() {
        do{
            System.out.println("Bạn muốn sắp xếp theo :");
            System.out.println("1.Theo ID");
            System.out.println("2.Theo Tên:");
            System.out.print("Nhập lựa chọ của bạn :");
            int chooseSort = Integer.parseInt(SCANNER.nextLine());
            if(chooseSort==1){
                List<Student> studentList = ReadWriteFileStudent.readFileStudent(PATH);
                Collections.sort(studentList, new StudentService());
                ReadWriteFileStudent.writeFileStudent(PATH, studentList);
                System.out.println("Đã sắp xếp học viên theo ID tăng dần");
                break;
            }else if(chooseSort==2){
                List<Student> studentList = ReadWriteFileStudent.readFileStudent(PATH);
                Collections.sort(studentList);
                ReadWriteFileStudent.writeFileStudent(PATH, studentList);
                System.out.println("Đã sắp xếp theo Tên tăng dần");
                break;
            }else {
                System.out.println("Bạn nhập sai rồi , mời bạn nhập lại :");
            }

        }while (true);

    }

    public Student enterInForStudent() {
        List<Student> studentList = ReadWriteFileStudent.readFileStudent(PATH);
        int idEnd = studentList.get(studentList.size()-1).getId();
        int id;
        String name;
        String dateOfBirth;
        String sex;
        String className;
        double score;

        id = idEnd+1;

        System.out.print("Nhập tên học viên:");
        name = SCANNER.nextLine();

        System.out.print("Nhập ngày sinh học viên :");
        dateOfBirth = SCANNER.nextLine();

        System.out.print("Nhập giói tính học viên :");
        sex = SCANNER.nextLine();

        System.out.print("Nhập tên lớp của học viên:");
        className = SCANNER.nextLine();

        System.out.print("Nhập điểm của học viên:");
        score = Double.parseDouble(SCANNER.nextLine());

        return new Student(id, name, dateOfBirth, sex, className, score);
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId()-o2.getId();
    }
}
