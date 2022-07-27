package CaseStudy.Repository;

import CaseStudy.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static List<Employee> employeeList;

    static {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("A",true,"1/2/2000","abc@gmail.com","123","0901",1,"Đại học", "tiếp tân",8000000));
        employeeList.add(new Employee("B",false,"1/5/2000","abcd@gmail.com","12356","0901",2,"Sinh viên", "Phục vụ",5000000));
        employeeList.add(new Employee("C",true,"1/9/2000","abce@gmail.com","12322","0901",3,"Đại học", "Quản lý",10000000));
        employeeList.add(new Employee("D",false,"1/10/2000","abcrrr@gmail.com","12345","0901",4,"Đại học", "tiếp tân",8000000));

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
    public void updateEmployee( int id, double wage, String Email, String sdt, String level, String office) {
        int index= 0;
        for (Employee value : employeeList){
            if (value.getID()== id){
                index = employeeList.indexOf(value);
                break;
            }
        }
        Employee employee = employeeList.get(index);
        employee.setOffice(office);
        employee.setLevel(level);
        employee.setWage(wage);
        employee.setEmail(Email);
    }


}
