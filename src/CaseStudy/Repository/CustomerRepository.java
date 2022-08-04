package CaseStudy.Repository;

import CaseStudy.models.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> show();

    void addNew(Customer customer);

    void upCustomer(String name, boolean gender, String email, String CMND, String sdt, String typeCustomer, String address, int codeCustomer);


}
