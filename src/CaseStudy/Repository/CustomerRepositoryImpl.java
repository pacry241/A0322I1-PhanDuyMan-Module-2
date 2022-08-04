package CaseStudy.Repository;

import CaseStudy.models.Customer;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    private static List<Customer> listCustomer;

    static {
        listCustomer = new LinkedList<>();
        listCustomer.add(new Customer("Nguyễn Đình A",true, "24/01/1995","abcPhan@gmail.com","1234567890","0905846723","Diamond","Khu A",1));
        listCustomer.add(new Customer("Nguyễn Đình B",true, "24/01/1996","abcPhan@gmail.com","1234567890","0905846723","Diamond","Khu A",1));
        listCustomer.add(new Customer("Nguyễn Đình C",false, "24/01/1994","abcPhan@gmail.com","1234567890","0905846723","Diamond","Khu A",1));
        listCustomer.add(new Customer("Nguyễn Đình D",false, "24/01/1997","abcPhan@gmail.com","1234567890","0905846723","Diamond","Khu A",1));
    }
    @Override
    public List<Customer> show() {
        return listCustomer;
    }

    @Override
    public void addNew(Customer customer) {
        listCustomer.add(customer);
    }

    @Override
    public void upCustomer(String name, boolean gender, String email, String CMND, String sdt, String typeCustomer, String address, int codeCustomer) {
        int index = 0;
        for (Customer customer : listCustomer){
           if (customer.getCodeCustomer()==codeCustomer){
               index = listCustomer.indexOf(customer);
               break;
           }

           Customer customerUp = listCustomer.get(index);
           customerUp.setAddress(address);
           customerUp.setTypeCustomer(typeCustomer);
           customerUp.setEmail(email);
           customerUp.setSdt(sdt);

        }
    }
}
