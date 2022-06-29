package CaseStudy.models;

public class House extends Facility {
    private  String roomStandardHouse;
    private int floorHouse;

    public House(){};

    public House(String roomStandardHouse, int floornumber) {
        this.roomStandardHouse = roomStandardHouse;
        this.floorHouse = floornumber;
    }

    public House(String nameService, double areaUse, double rentService, int maxPerson, String typeService, String roomStandardHouse, int floornumber) {
        super(nameService, areaUse, rentService, maxPerson, typeService);
        this.roomStandardHouse = roomStandardHouse;
        this.floorHouse = floornumber;
    }

    public String getRoomStandardHouse() {
        return roomStandardHouse;
    }

    public void setRoomStandardHouse(String roomStandardHouse) {
        this.roomStandardHouse = roomStandardHouse;
    }

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }
}
