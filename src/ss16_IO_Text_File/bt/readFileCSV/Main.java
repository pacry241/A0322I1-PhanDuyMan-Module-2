package ss16_IO_Text_File.bt.readFileCSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Nation> listNation = new LinkedList<>();

    public static void readCSV(String pathFile){
        try {
            File file = new File(pathFile);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));

            String line = "";

            while ((line = bufferedReader.readLine())!=null){
                String[] myArr= line.split(",");
                listNation.add(new Nation(Integer.parseInt(myArr[0]),myArr[1],myArr[2]));
            }
        } catch (Exception e) {
            System.out.println("Có lỗi");
        }
    }

    public static void main(String[] args) {
        String file ="D:\\Codegym\\Mudule2\\A0322I1-PhanDuyMan-Module-2\\src\\ss16_IO_Text_File\\bt\\readFileCSV\\nation.csv";
        readCSV(file);
        for (Nation value : listNation){
            System.out.println(value);
        }
    }
}
