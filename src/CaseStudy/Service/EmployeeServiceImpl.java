package CaseStudy.Service;

import CaseStudy.Repository.EmployeeRepository;
import CaseStudy.Repository.EmployeeRepositoryImpl;
import CaseStudy.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    private EmployeeRepository repository = new EmployeeRepositoryImpl();

    @Override
    public List<Employee> findALl() {
        return repository.findALl();
    }

    @Override
    public void addEmployee(Employee employee) {
        repository.addEmployee(employee);
    }

    @Override
    public void updateEmployee(int id, double wage, String Email, long phoneNumber, String level, String office) {
        repository.updateEmployee(id, wage, Email, phoneNumber, level, office);
    }


}
