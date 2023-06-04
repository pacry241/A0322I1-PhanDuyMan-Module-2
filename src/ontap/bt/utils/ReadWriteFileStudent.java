package ontap.bt.utils;

import ontap.bt.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileStudent {
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

    public static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readFileStudent(String path) {
        List<String> stringList = readFile(path);
        List<Student> studentList = new ArrayList<>();
        String[] info;
        for (String string : stringList) {
            info = string.split(",");
            studentList.add(new Student(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4],
                    Double.parseDouble(info[5])));
        }
        return studentList;
    }

    public static void writeFileStudent(String path, List<Student> studentList){
        StringBuilder data = new StringBuilder();
        for (Student student: studentList) {
            data.append(student.getInfor());
        }
        writeFile(path,data.toString());
    }
}
