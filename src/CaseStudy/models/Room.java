package CaseStudy.models;

public class Room extends Facility {
    private String freeService;

    public Room(){};

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, double areaUse, double rentService, int maxPerson, String typeService, String freeService) {
        super(nameService, areaUse, rentService, maxPerson, typeService);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
