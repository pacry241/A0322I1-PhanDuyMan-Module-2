package CaseStudy.models;

public class House extends Facility {
    private  String roomStandardHouse;
    private int floorHouse;

    public House(){};

    public House(String roomStandardHouse, int floornumber) {
        this.roomStandardHouse = roomStandardHouse;
        this.floorHouse = floornumber;
    }

    public House(int idFacility, String nameService, double areaUse, double rentService, int maxPerson, String typeService, String roomStandardHouse, int floorHouse) {
        super(idFacility, nameService, areaUse, rentService, maxPerson, typeService);
        this.roomStandardHouse = roomStandardHouse;
        this.floorHouse = floorHouse;
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

    @Override
    public String toString() {
        return "House{" +
                "roomStandardHouse='" + roomStandardHouse + '\'' +
                ", floorHouse=" + floorHouse +
                '}'+super.toString();
    }
}
