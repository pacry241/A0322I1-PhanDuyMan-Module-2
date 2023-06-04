package ontap.bt.controller;

import java.util.Scanner;

public class MainController {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void menuController(){
        do {
            System.out.println("CHÀO MỪNG BẠN ĐẾN VỚI CHƯƠNG TRÌNH QUẢN LÝ CODEGYM");
            System.out.println("1.Quản lý giảng viên");
            System.out.println("2.Quản lý học viên");
            System.out.println("3.Thoát chương trình");
            System.out.print("Nhập chức năng bạn muốn sử dụng :.");
            int choose = Integer.parseInt(SCANNER.nextLine());
            switch (choose){
                case 1:
                    TeacherController.menuTeacher();
                    break;
                case 2:
                    StudentController.menuStudent();
                    break;
                case 3:
                    System.exit(0);
            }
        }while (true);
    }
}
