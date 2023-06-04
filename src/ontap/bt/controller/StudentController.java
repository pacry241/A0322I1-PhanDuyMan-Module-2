package ontap.bt.controller;

import ontap.bt.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static StudentService studentService = new StudentService();
    public static void menuStudent(){
        do {
            System.out.println("-------------Menu quản lý học viên--------------");
            System.out.println("1.Thêm học viên mới");
            System.out.println("2.Xóa học viên theo id");
            System.out.println("3.Hiển thị danh sách học viên");
            System.out.println("4.Sắp xếp danh sách học viên");
            System.out.println("5.Quay lại menu chính");
            System.out.print("Nhập chức năng bạn muốn sử dụng :");
            int choose =Integer.parseInt(SCANNER.nextLine());
            switch (choose){
                case 1:
                    studentService.add();
                    break;
                case 2:
                    studentService.remove();
                    break;
                case 3:
                    studentService.disPlay();
                    break;
                case 4:
                    studentService.sort();
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
