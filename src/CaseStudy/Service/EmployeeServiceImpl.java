package CaseStudy.Service;

import CaseStudy.Repository.Level;
import CaseStudy.Repository.Office;
import CaseStudy.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    private static List<Employee> employeeList;

    static {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ngoc Minh","men","qas","sadasd@.gmail.com",912490023,12323,Level.DaiHoc,Office.Reception,213213.3));
    }

    @Override
    public List<Employee> findALl() {
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employee = new Employee();
        employeeList.add(employee);

    }

    @Override
    public void updateEmployee(Employee employee, double wage, String Email, long phoneNumber, Level level, Office office) {
        if (employeeList.equals(employee)){
            employee.setWage(wage);
            employee.setEmail(Email);
            employee.setPhoneNumber(phoneNumber);
            employee.setAcademicLevel(level);
            employee.setOffice(office);
        }else {
            System.out.println("Không tìm thấy phần tử ");
        }
    }




}
