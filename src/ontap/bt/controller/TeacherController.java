package ontap.bt.controller;

import ontap.bt.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static TeacherService teacherService = new TeacherService();
    public static void menuTeacher(){
        do {
            System.out.println("-------------Menu quản lý giảng viên--------------");
            System.out.println("1.Thêm giảng viên mới");
            System.out.println("2.Xóa giảng viên theo id");
            System.out.println("3.Hiển thị danh sách giảng viên");
            System.out.println("4.Sắp xếp danh sách giảng viên");
            System.out.println("5.Quay lại menu chính.");
            System.out.print("Nhập chức năng bạn muốn sử dụng. :");
            int choose =Integer.parseInt(SCANNER.nextLine());
            switch (choose){
                case 1:
                    teacherService.add();
                    break;
                case 2:
                    teacherService.remove();
                    break;
                case 3:
                    teacherService.disPlay();
                    break;
                case 4:
                    teacherService.sort();
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
