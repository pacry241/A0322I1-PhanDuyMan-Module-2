package CaseStudy.Service.Impl;

import CaseStudy.Repository.EmployeeRepository;
import CaseStudy.Repository.EmployeeRepositoryImpl;
import CaseStudy.Service.Interface.EmployeeService;
import CaseStudy.models.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    private EmployeeRepository repository = new EmployeeRepositoryImpl();

    @Override
    public List<Employee> findALl() {
        return repository.findALl();
    }

    @Override
    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập giới tính: ");
        String input = scanner.nextLine();
        boolean gender = true ;
        if (input.toLowerCase()=="nam"){
            gender = true;
        }
        if (input.toLowerCase()=="nu"){
            gender = false;
        }

        System.out.println("Nhập ngày sinh: ");
        String date = scanner.nextLine();

        System.out.println("Nhập địa chỉ Email: ");
        String email = scanner.nextLine();

        System.out.println("Nhập CMND: ");
        String Cmnd = scanner.nextLine();

        System.out.println("Nhập số điện thoại: ");
        String sdt = scanner.nextLine();

        System.out.println("Nhập trình độ học vấn: ");
        String level = scanner.nextLine();


        System.out.println("Nhập ID của nhân viên: ");
        int id = Integer.parseInt(scanner.nextLine());
        do {
            int check =1;
            for (int i =0; i<repository.findALl().size();i++){
                if (repository.findALl().get(i).getID()==id){
                    System.out.println("Nhập lại ID");
                    id = Integer.parseInt(scanner.nextLine());
                    check = 0;
                }
            }
            if (check==1){
                break;
            }
        }while (true);
        System.out.println("Nhập chức vụ: ");
        String office = scanner.nextLine();

        System.out.println("Nhập số lương cho nhân viên mới: ");
        double wage = scanner.nextDouble();

        Employee employee = new Employee(name,gender,date,email,Cmnd,sdt,id,level,office,wage);

        repository.addEmployee(employee);
        System.out.println("Thêm thành công nhân viên mới");
    }

    @Override
    public void updateEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID cần sửa");
        int ID = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tiền lương: ");
        double wage = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập chức vụ: ");
        String office = scanner.nextLine();

        System.out.println("Nhập trình độ học vấn: ");
        String level = scanner.nextLine();

        System.out.println("Nhập số điện thoại: ");
        String sdt = scanner.nextLine();

        System.out.println("Nhập địa chỉ Email: ");
        String email = scanner.nextLine();

        repository.updateEmployee(ID,wage,email,sdt,level,office);
    }


}
