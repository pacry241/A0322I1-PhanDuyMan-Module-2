package CaseStudy.Service;

import CaseStudy.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    private static List<Employee> employeeList;

    static {
        employeeList = new ArrayList<>();
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
    public void updateEmployee(Employee employee,double wage, String Email,long phoneNumber) {
        if (employeeList.equals(employee)){
            employee.setWage(wage);
            employee.setEmail(Email);
            employee.setPhoneNumber(phoneNumber);
        }
    }


}
