package ontap.bt.service.impl;

import ontap.bt.model.Teacher;
import ontap.bt.service.IPersonService;
import ontap.bt.utils.ReadWriteFileTeacher;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPersonService, Comparator<Teacher> {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "D:\\Codegym\\Mudule2\\A0322I1-PhanDuyMan-Module-2\\src\\ontap\\bt\\data\\teacher.csv";

    @Override
    public void add() {
        List<Teacher> teacherList = ReadWriteFileTeacher.readFileTeacher(PATH);
        Teacher teacher = enterInForTeacher();
        teacherList.add(teacher);
        ReadWriteFileTeacher.writeFileTeacher(PATH, teacherList);
        System.out.println("Thêm thành công giảng viên vào danh sách");
    }

    @Override
    public void remove() {
        List<Teacher> teacherList = ReadWriteFileTeacher.readFileTeacher(PATH);
        int idFind;
        boolean check = false;
        if (teacherList.isEmpty()) {
            System.out.println("Danh sách giảng viên đang trống");
        } else {
            System.out.print("Nhập id của giảng viên bạn cần xóa :");
            idFind = Integer.parseInt(SCANNER.nextLine());
            for (Teacher teacher : teacherList) {
                if (teacher.getId() == idFind) {
                    System.out.println("Bạn có chắn chắn xóa giảng viên có id " + idFind + " là " + teacher.getName() + " không ?");
                    System.out.println("1.Có");
                    System.out.println("2.Không");
                    System.out.print("Nhập lựa chọn bạn muốn:");
                    int chooseYesNo = Integer.parseInt(SCANNER.nextLine());
                    if (chooseYesNo == 1) {
                        teacherList.remove(teacher);
                        ReadWriteFileTeacher.writeFileTeacher(PATH, teacherList);
                        System.out.println("Xóa giảng viên thành công");
                        check = true;
                        break;
                    } else {
                        check = true;
                        break;
                    }

                }
            }
            if (!check) {
                System.out.println("Không tìm thấy giảng viên có id " + idFind + " này");
            }
        }


    }

    @Override
    public void disPlay() {
        List<Teacher> teacherList = ReadWriteFileTeacher.readFileTeacher(PATH);
        if (teacherList.isEmpty()) {
            System.out.println("Danh sách giảng viên đang trống");
        }
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i));
        }
    }

    @Override
    public void sort() {
        do{
            System.out.println("Bạn muốn sắp xếp danh sách giảng viên ");
            System.out.println("1.Theo ID");
            System.out.println("2.Theo Tên");
            System.out.print("Nhập lựa chọn bạn muốn :");
            int chooseSort = Integer.parseInt(SCANNER.nextLine());
            if(chooseSort==1){
                List<Teacher> teacherList = ReadWriteFileTeacher.readFileTeacher(PATH);
                Collections.sort(teacherList,new TeacherService());
                ReadWriteFileTeacher.writeFileTeacher(PATH, teacherList);
                System.out.println("Đã sắp xếp giảng viên theo ID");
                break;
            }else if(chooseSort==2){
                List<Teacher> teacherList = ReadWriteFileTeacher.readFileTeacher(PATH);
                Collections.sort(teacherList);
                ReadWriteFileTeacher.writeFileTeacher(PATH, teacherList);
                System.out.println("Đã sắp xếp giảng viên theo Tên");
                break;
            }else {
                System.out.println("Bạn chọn sai rồi , mời bạn chọn lại");
            }
        }while (true);
    }

    public Teacher enterInForTeacher() {
        List<Teacher> teacherList = ReadWriteFileTeacher.readFileTeacher(PATH);
        int idEnd = teacherList.get(teacherList.size()-1).getId();
        int id;
        String name;
        String dateOfBirth;
        String sex;
        String specialist;


        id = idEnd+1;

        System.out.print("Nhập tên giảng viên:");
        name = SCANNER.nextLine();

        System.out.print("Nhập ngày sinh giảng viên :");
        dateOfBirth = SCANNER.nextLine();

        System.out.print("Nhập giói tính giảng viên :");
        sex = SCANNER.nextLine();

        System.out.print("Nhập chuyên môn của giảng viên:");
        specialist = SCANNER.nextLine();

        return new Teacher(id, name, dateOfBirth, sex, specialist);
    }

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getId()-o2.getId();
    }
}
