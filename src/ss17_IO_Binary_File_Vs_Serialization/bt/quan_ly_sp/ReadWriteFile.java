package ss17_IO_Binary_File_Vs_Serialization.bt.quan_ly_sp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWriteFile {
    public static void writeFile(String path, List<Product> products){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        String path = "D:\\Codegym\\Mudule2\\A0322I1-PhanDuyMan-Module-2\\src\\ss17_IO_Binary_File_Vs_Serialization\\bt\\quan_ly_sp\\product.csv";
        Scanner scanner = new Scanner(System.in);
        List<Product> productData = readDataFromFile(path);
        int choseMenu = -1;
        do{
            System.out.println("Enter number: ");
            System.out.println("1. Display Products");
            System.out.println("2. Add Product");
            System.out.println("3. Search");
            System.out.println("4. End");
            choseMenu = Integer.parseInt(scanner.nextLine());
            switch (choseMenu){
                case 1:
                    for (Product product : productData){
                        System.out.println(product);
                    }
                    break;
                case 2:
                    System.out.println("Enter id for new Product: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter name for new Product: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter description of birth for new Product: ");
                    String description = scanner.nextLine();
                    System.out.println("Enter brand for new Product : ");
                    String brand = scanner.nextLine();
                    System.out.println("Enter price for new Product : ");
                    double price = Double.parseDouble(scanner.nextLine());
                    productData.add(new Product(id,name,brand,price,description));
                    System.out.println("Price add success");
                    writeFile(path, products);
                    break;
                case 3:
                    System.out.println("Enter Name you want to search: ");
                    String nameSearch = scanner.nextLine().trim();
                    boolean checkNull = false;
                    for (Product product : productData){
                        if(nameSearch.equals(product.getName())){
                            checkNull = true;
                            System.out.println(product);
                        }
                    }
                    if(!checkNull){
                        System.out.println("No product Found by name " + nameSearch);
                    }
                    break;
            }
        }while (choseMenu != 4);
    }
}
