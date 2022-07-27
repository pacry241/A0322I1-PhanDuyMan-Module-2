package CaseStudy.models;



public class Customer extends Person{
    private Type typeCustomer;
    private String address;
    private int codeCustomer;

    enum Type{
        Diamond,
        Platinium,
        Gold,
        Silver,
        Member
    }
    public Customer(){};

    public Customer(Type typeCustomer, String address, int codeCustomer) {
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.codeCustomer = codeCustomer;
    }

    public Customer(String name, boolean gender, String dateOfBirth, String email, String CMND, String sdt, Type typeCustomer, String address, int codeCustomer) {
        super(name, gender, dateOfBirth, email, CMND, sdt);
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.codeCustomer = codeCustomer;
    }

    public Type getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(Type typeCustomer) {
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

}
