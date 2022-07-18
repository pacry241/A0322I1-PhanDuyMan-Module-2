package CaseStudy.Service;

import CaseStudy.models.Employee;

import java.util.List;

public interface EmployeeService extends Service{

    List<Employee> findALl();
    void addEmployee(Employee employee);
    void updateEmployee(int id, double wage, String Email, long phoneNumber, java.lang.String level, String office);

}
