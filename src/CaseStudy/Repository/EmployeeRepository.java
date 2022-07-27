package CaseStudy.Repository;

import CaseStudy.models.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findALl();

    void addEmployee(Employee employee);

    void updateEmployee(int id, double wage, String Email, String sdt, String level, String office);
}
