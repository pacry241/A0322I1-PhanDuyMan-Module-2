package CaseStudy.Repository;

import CaseStudy.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static List<Employee> employeeList;

    static {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,1,"Đại Học","Tiếp tân", 1224124.3));
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,2,"Đại Học","Tiếp tân", 1224124.3));
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,3,"Đại Học","Tiếp tân", 1224124.3));
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,4,"Đại Học","Tiếp tân", 1224124.3));
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,5,"Đại Học","Tiếp tân", 1224124.3));
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,6,"Đại Học","Tiếp tân", 1224124.3));
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,7,"Đại Học","Tiếp tân", 1224124.3));
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,8,"Đại Học","Tiếp tân", 1224124.3));
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,10,"Đại Học","Tiếp tân", 1224124.3));
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,9,"Đại Học","Tiếp tân", 1224124.3));
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,11,"Đại Học","Tiếp tân", 1224124.3));
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,12,"Đại Học","Tiếp tân", 1224124.3));
        employeeList.add(new Employee("Nguyen Van A", "Men", "20/11/1999","abc@gmail.com",123456,9057838,15,"Đại Học","Tiếp tân", 1224124.3));
    }

    @Override
    public List<Employee> findALl() {
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void updateEmployee(int codeEmployee, double wage, String Email, long phoneNumber, String level, String office) {
        Employee employeeEdit = new Employee();
        int temp = 0;
        for (int i = 0;i<employeeList.size();i++){
            if (codeEmployee == employeeList.get(i).getCodeEmployee()){
                temp = i;
                break;
            }
        }
        employeeEdit = employeeList.get(temp);
        //Chỉnh sửa
        employeeEdit.setEmail(Email);
        employeeEdit.setWage(wage);
        employeeEdit.setPhoneNumber(phoneNumber);
        employeeEdit.setOffice(office);
        employeeEdit.setAcademicLevel(level);
    }

    public static void main(String[] args) {

    }
}
