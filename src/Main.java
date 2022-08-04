import CaseStudy.models.Employee;
import CaseStudy.models.Facility;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> myList  =  new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        myList.add(5);
//
//        Scanner scanner = new Scanner(System.in);
//        int input = Integer.parseInt(scanner.nextLine());
//        System.out.println(myList);
//        System.out.println(myList.contains(input));
//        do {
//            for (Integer value : myList){
//                if (value == input){
//                    System.out.println("Nhập lại");
//                    input = Integer.parseInt(scanner.nextLine());
//                }
//            }
//        }while (myList.contains(input));
//        System.out.println("Số vừa nhập là: "+ input);
//    }
        List<Employee> employeeList;
        employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("A",true,"1/2/2000","abc@gmail.com","123","0901",1,"Đại học", "tiếp tân",8000000));
        employeeList.add(new Employee("B",false,"1/5/2000","abcd@gmail.com","12356","0901",2,"Sinh viên", "Phục vụ",5000000));
        employeeList.add(new Employee("C",true,"1/9/2000","abce@gmail.com","12322","0901",3,"Đại học", "Quản lý",10000000));
        employeeList.add(new Employee("D",false,"1/10/2000","abcrrr@gmail.com","12345","0901",4,"Đại học", "tiếp tân",8000000));

        Scanner scanner = new Scanner(System.in);
////        Employee employee1 = new Employee("C",true,"1/9/2000","abce@gmail.com","12322","0901",3,"Đại học", "Quản lý",10000000);
////        employeeList.add(employee1);
////        Employee employee2 = new Employee("C",true,"1/9/2000","abce@gmail.com","12322","0901",3,"Đại học", "Quản lý",10000000);
////        System.out.println(employeeList.contains(employee2));
////        System.out.println("Nhập ID của nhân viên: ");
//        Employee employee = new Employee("D",false,"1/10/2000","abcrrr@gmail.com","12345","0901",4,"Đại học", "tiếp tân",8000000);
//        int id  = Integer.parseInt(scanner.nextLine());
//        do {
//            int check =1;
//            for (int i =0; i<employeeList.size();i++){
//                if (employeeList.get(i).getID()==id){
//                    System.out.println("Nhập lại ID");
//                    id = Integer.parseInt(scanner.nextLine());
//                    check = 0;
//                }
//            }
//            if (check==1){
//                break;
//            }
//        }while (true);
        Map<Employee, Integer> myMap = new LinkedHashMap<>();
        int i = 0;
        for (Employee value : employeeList){
            myMap.put(value,i);
            i +=1;
        }
            for (Map.Entry<Employee,Integer> value : myMap.entrySet()){
                System.out.println(value.toString());
            }

//        System.out.println("1.\t Add New Villa");
//        System.out.println("2.\t Add New House");
//        System.out.println("3.\t Add New Room");
//        boolean check = true;
//        while (true) {
//            System.out.println("Nhập lựa chọn của bạn: ");
//            int chose = Integer.parseInt(scanner.nextLine());
//            switch (chose) {
//                case 1:
////                    addVilla();
//                    check = true;
//                    break;
//                case 2:
////                    addHouse();
//                    check = true;
//                    break;
//                case 3:
////                    addRoom();
//                    check = true;
//                    break;
//                default:
//                    check = false;
//                    break;
//            }
//            if (check == false) {
//                break;
//            }
//
//        }
    }
}
