package CaseStudy.Service.Impl;

import CaseStudy.Repository.CustomerRepository;
import CaseStudy.Repository.CustomerRepositoryImpl;
import CaseStudy.Service.Interface.CustomerService;
import CaseStudy.models.Customer;

import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public void showAll() {
        for (Customer value: customerRepository.show()){
            System.out.println(value.toString());
        };
    }

    @Override
    public void addNew() {
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

        System.out.println("Nhập loại khác hàng: ");
        String type = scanner.nextLine();

        System.out.println("Nhập địa chỉ cho khách hàng: ");
        String address = scanner.nextLine();

        System.out.println("Nhập ID của nhân viên: ");
        int id = Integer.parseInt(scanner.nextLine());
        do {
            int check =1;
            for (int i =0; i<customerRepository.show().size();i++){
                if (customerRepository.show().get(i).getCodeCustomer()==id){
                    System.out.println("Nhập lại ID");
                    id = Integer.parseInt(scanner.nextLine());
                    check = 0;
                }
            }
            if (check==1){
                break;
            }
        }while (true);
        Customer customer = new Customer(name,gender,email,date,Cmnd,sdt,type,address,id);

        customerRepository.addNew(customer);

        System.out.println("Thêm thành công khách hàng");
    }



    @Override
    public void upData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID cần sửa");
        int ID = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số điện thoại: ");
        String sdt = scanner.nextLine();

        System.out.println("Nhập địa chỉ Email: ");
        String email = scanner.nextLine();

        System.out.println("Nhập lại giới tính: ");
        String gender1 = scanner.nextLine();
        boolean gender = true;
        if (gender1 == "nam"){
             gender = true;
        }else {
             gender = false;
        }

        System.out.println("Nhập tên mới của khách hàng: ");
        String name = scanner.nextLine();

        System.out.println("Nhập CMND: ");
        String  cmnd = scanner.nextLine();

        System.out.println("Nhập loại khác hàng: ");
        String type = scanner.nextLine();

        System.out.println("Nhập địa chỉ cho khách hàng: ");
        String address = scanner.nextLine();

        customerRepository.upCustomer(name,gender,email,cmnd,sdt,type,address,ID);

    }
}
