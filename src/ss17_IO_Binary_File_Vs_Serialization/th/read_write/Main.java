package ss17_IO_Binary_File_Vs_Serialization.th.read_write;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Product> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path){
        List<Product> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
    public static void main(String[] args) {
        List<Product> students = new ArrayList<>();
        students.add(new Product(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Product(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Product(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Product(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Product(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        String path = "D:\\Codegym\\Mudule2\\A0322I1-PhanDuyMan-Module-2\\src\\ss17_IO_Binary_File_Vs_Serialization\\th\\read_write\\studens.csv";
        writeToFile(path, students);
        List<Product> studentDataFromFile = readDataFromFile(path);
        for (Product student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
