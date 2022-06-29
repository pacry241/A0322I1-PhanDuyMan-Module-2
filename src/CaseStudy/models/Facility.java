package CaseStudy.models;

public abstract class Facility {
    private  String nameService;
    private double areaUse;
    private double rentService;
    private int maxPerson;
    private String typeService;

    public Facility(){};

    public Facility(String nameService, double areaUse, double rentService, int maxPerson, String typeService) {
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentService = rentService;
        this.maxPerson = maxPerson;
        this.typeService = typeService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getRentService() {
        return rentService;
    }

    public void setRentService(double rentService) {
        this.rentService = rentService;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", rentService=" + rentService +
                ", maxPerson=" + maxPerson +
                ", typeService='" + typeService + '\'' +
                '}';
    }
}
