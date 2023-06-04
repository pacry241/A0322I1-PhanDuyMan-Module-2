package baithi2.utils;

import baithi2.model.TaiKhoanThanhToan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFileTaiKhoanThanhToan {
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

    public static void ghiFileThanhToan(String path, List<TaiKhoanThanhToan> taiKhoanThanhToanList){
        StringBuilder data = new StringBuilder();
        for (TaiKhoanThanhToan value: taiKhoanThanhToanList) {
            data.append(value.getInfor());
        }
        ghiFile(path,data.toString());
    }

    public static List<TaiKhoanThanhToan> docFileThanhToan(String path){
        List<String> stringList = docFile(path);
        List<TaiKhoanThanhToan> taiKhoanThanhToans = new ArrayList<>();
        String[] list ;
        for (String string: stringList){
            list = string.split(",");
            taiKhoanThanhToans.add(new TaiKhoanThanhToan((Integer.parseInt(list[0])),list[1],list[2],list[3],(Integer.parseInt(list[4])),(Double.parseDouble(list[5]))));
        }
        return taiKhoanThanhToans;

    }
}
