package ss16_IO_Text_File.th.tim_gia_tri_lon_nhat;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static final  String number ="D:\\Codegym\\Mudule2\\A0322I1-PhanDuyMan-Module-2\\src\\ss16_IO_Text_File\\th\\tim_gia_tri_lon_nhat\\number";

    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Codegym\\Mudule2\\A0322I1-PhanDuyMan-Module-2\\src\\ss16_IO_Text_File\\th\\tim_gia_tri_lon_nhat\\number");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\Codegym\\Mudule2\\A0322I1-PhanDuyMan-Module-2\\src\\ss16_IO_Text_File\\th\\tim_gia_tri_lon_nhat\\result", maxValue);
    }
}
