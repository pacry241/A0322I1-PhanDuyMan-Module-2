package CaseStudy.controllers;

public abstract class Facility {
    private String name;
    public  abstract String nameService(String name);
    public abstract void areaService(double chieudai, double chieurong);
    public abstract void costRentService(int nguoi);
    public abstract void amountMaxPerson();
    public abstract void timeRent();

}
