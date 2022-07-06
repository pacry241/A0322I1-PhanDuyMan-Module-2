package CaseStudy.Service;

import CaseStudy.models.Employee;

import java.util.List;

public interface EmployeeService extends Service{

    List<Employee> findALl();
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee,double wage, String Email,long phoneNumber);
}
