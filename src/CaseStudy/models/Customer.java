package CaseStudy.models;



public class Customer extends Person{
    private String typeCustomer;
    private String address;
    private int codeCustomer;


    public Customer(){};


    public Customer(String name, boolean gender, String dateOfBirth, String email, String CMND, String sdt, String typeCustomer, String address, int codeCustomer) {
        super(name, gender, dateOfBirth, email, CMND, sdt);
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.codeCustomer = codeCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(int codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                ", codeCustomer=" + codeCustomer +
                '}'+super.toString();
    }
}
