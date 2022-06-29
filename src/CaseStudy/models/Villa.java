package CaseStudy.models;

public class Villa  extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floorNumber;

    public Villa(){
    }

    public Villa(String roomStandard, double poolArea, int floornumber) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumber = floornumber;
    }

    public Villa(String nameService, double areaUse, double rentService, int maxPerson, String typeService, String roomStandard, double poolArea, int floornumber) {
        super(nameService, areaUse, rentService, maxPerson, typeService);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumber = floornumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
