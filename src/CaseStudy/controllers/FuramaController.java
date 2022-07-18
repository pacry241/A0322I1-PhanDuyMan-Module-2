package CaseStudy.controllers;
import CaseStudy.Service.EmployeeService;
import CaseStudy.Service.EmployeeServiceImpl;
import CaseStudy.models.Employee;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    private EmployeeService employeeService = new EmployeeServiceImpl();
    public static int displayMainMenu(){
        System.out.println("Chose on Menu: ");
        System.out.println("1.\tEmployee Management");
        System.out.println("2.\tCustomer Management");
        System.out.println("3.\tFacility Management ");
        System.out.println("4.\tBooking Management");
        System.out.println("5.\tPromotion Management");
        System.out.println("6.\tExit");
        int chose = scanner.nextInt();
        return chose;
    }

    public static int employeeManagement (){
        System.out.println("Chose on Menu Employee Management :");
        System.out.println("1\tDisplay list employees");
        System.out.println("2\tAdd new employee");
        System.out.println("3\tEdit employee");
        System.out.println("4\tReturn main menu");
        int chose = Integer.parseInt(scanner.nextLine());
        return chose;
    }

    public void displaylistEmployees(){
        for (Employee employee : employeeService.findALl()){
            System.out.println(employee);
        };
        System.out.println("------------------");
    }
    public void addNewEmployee(Employee employee){
        employeeService.addEmployee(employee);
    }


    public static int customerManagement  (){
        System.out.println("Chose on Menu Customer Management  :");
        System.out.println("1.\tDisplay list customers");
        System.out.println("2.\tAdd new customer");
        System.out.println("3.\tEdit customer");
        System.out.println("4.\tReturn main menu");
        int chose = scanner.nextInt();
        return chose;
    }

    public static int facilityManagement   (){
        System.out.println("Chose on Menu Facility Management  :");
        System.out.println("1\tDisplay list facility");
        System.out.println("2\tAdd new facility");
        System.out.println("3\tDisplay list facility maintenance");
        System.out.println("4\tReturn main menu");
        int chose = scanner.nextInt();
        return chose;
    }

    public static int bookingManagerment   (){
        System.out.println("Chose on Menu Booking Managerment   :");
        System.out.println("1.\tAdd new booking");
        System.out.println("2.\tDisplay list booking");
        System.out.println("3.\tCreate new constracts");
        System.out.println("4.\tDisplay list contracts");
        System.out.println("5.\tEdit contracts");
        System.out.println("6.\tReturn main menu");
        int chose = scanner.nextInt();
        return chose;
    }

    public static int promotionManagement    (){
        System.out.println("Chose on Menu Promotion Management   :");
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
        int chose = Integer.parseInt(scanner.nextLine());
        return chose;
    }



    public static void main(String[] args) {
        FuramaController Employee = new FuramaController();
//        int choseMenu, choseMenuAfter = -1;
//        do {
//            System.out.println("Enter chose: ");
//            choseMenu = displayMainMenu();
//            switch (choseMenu){
//                case 1:
//                    choseMenuAfter = employeeManagement();
//                    if(choseMenuAfter == 1){
//                        Employee.displaylistEmployees();
//                    }
//                    break;
//                case 2:
//                    choseMenuAfter = customerManagement();
//                    break;
//                case 3:
//                    choseMenuAfter = facilityManagement();
//                    break;
//                case 4:
//                    choseMenuAfter = bookingManagerment();
//                    break;
//                case 5:
//                    choseMenuAfter = promotionManagement();
//                    break;
//                case 6:
//                    System.out.println("Out of Menu");
//                    break;
//            }
//        }while (choseMenu != 6);
        Employee.displaylistEmployees();
        Employee.employeeService.updateEmployee(1,1000,"asdd@gmail.com",12344556,"Cao Dang","nhanvien");
        Employee.employeeService.updateEmployee(15,1000,"asdd@gmail.com",12344556,"Cao Dang","nhanvien");
        Employee.employeeService.updateEmployee(9,1000,"asdd@gmail.com",12344556,"Cao Dang","nhanvien");
        Employee.employeeService.updateEmployee(3,1000,"asdd@gmail.com",12344556,"Cao Dang","nhanvien");
        Employee.displaylistEmployees();

    }
}