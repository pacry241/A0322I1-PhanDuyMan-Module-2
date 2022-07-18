package CaseStudy.Repository;

import CaseStudy.models.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findALl();
    void addEmployee(Employee employee);
    void updateEmployee(int codeEmployee, double wage, String Email, long phoneNumber, String level, String office);
}
