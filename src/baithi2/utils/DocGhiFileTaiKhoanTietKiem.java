package baithi2.utils;

import baithi2.model.TaiKhoanTietKiem;
import com.sun.xml.internal.ws.util.xml.CDATA;
import ontap.bt.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFileTaiKhoanTietKiem {
    public static List<String> docFile(String path){
        List<String> stringList = new ArrayList<>();
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static void ghiFile(String path, String data){
        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<TaiKhoanTietKiem> docFileTietKiem(String path){
        List<String> stringList = docFile(path);
        List<TaiKhoanTietKiem> tietKiems = new ArrayList<>();
        String[] list ;
        for (String string : stringList){
            list = string.split(",");
            tietKiems.add(new TaiKhoanTietKiem((Integer.parseInt(list[0])),list[1],list[2],list[3],(Double.parseDouble(list[4])),list[5],(Double.parseDouble(list[6])),(Integer.parseInt(list[7]))));
        }
        return tietKiems;
    }

    public static void ghiFileTietKiem(String path, List<TaiKhoanTietKiem> taiKhoanTietKiemList){
        StringBuilder data = new StringBuilder();
        for (TaiKhoanTietKiem value: taiKhoanTietKiemList) {
            data.append(value.getInfor());
        }
        ghiFile(path,data.toString());
    }
}
