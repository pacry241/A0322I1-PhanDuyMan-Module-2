package CaseStudy.Repository;

import CaseStudy.models.*;

import javax.sound.midi.Soundbank;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityRepositoryImpl implements FacilityRepository {
    private static Map<Facility,Integer> myMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    static {
        Room room = new Room();
        myMap.put(room,1);

    }

    @Override
    public void showAll() {
        for (Map.Entry<Facility,Integer> value: myMap.entrySet()){
            System.out.println("Service" + value.getKey()+"Số lần thuê"+value.getValue());
        }
    }

    @Override
    public void addRoom() {
        System.out.println("Nhập Id Facility của Room : ");
        int idFacility = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();

        System.out.println("Chi phí thuê Room : ");
        double rentService = Double.parseDouble(scanner.nextLine());

        System.out.println("Diện tích Room: ");
        double areaUse = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập số lượng người: ");
        int person = Integer.parseInt(scanner.nextLine());

        System.out.println("Kiểu thuê: ");
        String typeService = scanner.nextLine();

        System.out.println("Dịch vụ miễn phí đi kèm: ");
        String freeService = scanner.nextLine();

        Room room = new Room(idFacility,nameService,areaUse,rentService,person,typeService,freeService);

        myMap.put(room,0);
        System.out.println("Thêm Room thành công");

    }

    @Override
    public void addHouse() {
        System.out.println("Nhập Id Facility của House : ");
        int idFacility = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();

        System.out.println("Chi phí thuê House : ");
        double rentService = Double.parseDouble(scanner.nextLine());

        System.out.println("Diện tích House: ");
        double areaUse = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập số lượng người: ");
        int person = Integer.parseInt(scanner.nextLine());

        System.out.println("Kiểu thuê: ");
        String typeService = scanner.nextLine();

        System.out.println("Tiêu chuẩn phòng cho House: ");
        String roomStandardHouse = scanner.nextLine();

        System.out.println("Số tầng của House: ");
        int floorHouse = Integer.parseInt(scanner.nextLine());

        House house = new House(idFacility,nameService,areaUse,rentService,person,typeService,roomStandardHouse,floorHouse);
        myMap.put(house,0);
        System.out.println("Thêm House mới thành công");
    }

    @Override
    public void addVilla() {
        System.out.println("Nhập Id Facility của Villa : ");
        int idFacility = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();

        System.out.println("Chi phí thuê Villa : ");
        double rentService = Double.parseDouble(scanner.nextLine());

        System.out.println("Diện tích Villa: ");
        double areaUse = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập số lượng người: ");
        int person = Integer.parseInt(scanner.nextLine());

        System.out.println("Kiểu thuê: ");
        String typeService = scanner.nextLine();

        System.out.println("Tiêu chuẩn phòng cho Villa: ");
        String roomStandardHouse = scanner.nextLine();

        System.out.println("Số tầng của Villa: ");
        int floorHouse = Integer.parseInt(scanner.nextLine());

        System.out.println("Diện tích hồ bơi: ");
        double poolArea = Double.parseDouble(scanner.nextLine());

        Villa villa = new Villa(idFacility,nameService,areaUse,rentService,person,typeService,roomStandardHouse,poolArea,floorHouse);

        myMap.put(villa,0);
        System.out.println("Thêm Villa mới thành công");
    }

    @Override
    public void addNewFacility() {
        System.out.println("1.\t Add New Villa");
        System.out.println("2.\t Add New House");
        System.out.println("3.\t Add New Room");
        System.out.println("4.\t Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    addVilla();
                    break;
                case 2:
                    addHouse();
                    break;
                case 3:
                    addRoom();
                    break;
                default:
                    break;
            }
        }


}
