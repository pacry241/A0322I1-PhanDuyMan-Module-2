package ontap.bt.utils;

import ontap.bt.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileTeacher {
    public static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<Teacher> readFileTeacher(String path){
        List<String> stringList = readFile(path);
        List<Teacher> teacherList = new ArrayList<>();
        String[] info;
        for (String string:stringList) {
            info=string.split(",");
            teacherList.add(new Teacher(Integer.parseInt(info[0]),info[1],info[2],info[3],info[4]));
        }
        return teacherList;
    }
    public static void writeFile(String path,String data){
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void writeFileTeacher(String path,List<Teacher> teacherList){
        StringBuilder data = new StringBuilder();
        for (Teacher teacher:teacherList) {
            data.append(teacher.getInfor());
        }
        writeFile(path,data.toString());
    }
}
