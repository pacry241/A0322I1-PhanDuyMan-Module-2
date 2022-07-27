package CaseStudy.Service;

import CaseStudy.models.Employee;

import java.util.List;

public interface EmployeeService extends Service{

    List<Employee> findALl();
    void addEmployee();
    void updateEmployee();

}
