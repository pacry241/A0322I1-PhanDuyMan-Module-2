package ss16_IO_Text_File.bt.Copy_file_text;

import java.io.*;

public class CopyFileText {
    public void copyFile (String source, String target){
        try {
            File FileSource = new File(source);
            File FileTarget = new File(target);

            if (!FileSource.exists()){
                throw new FileNotFoundException();
            }

            if (FileTarget.createNewFile()){
                System.out.println("File create"+ target);
            }else {
                System.out.println("File already"+ target);
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
            FileWriter fileWriter = new FileWriter(target);

            String line = "";

            while ((line = bufferedReader.readLine())!=null){
                fileWriter.write(line+"\n");
            }

            bufferedReader.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File không có ");
        } catch (Exception e) {
            System.out.println("Có lỗi");
        }
    }

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        String source = "D:\\Codegym\\Mudule2\\A0322I1-PhanDuyMan-Module-2\\src\\ss16_IO_Text_File\\bt\\Copy_file_text\\source.csv";
        String target = "D:\\Codegym\\Mudule2\\A0322I1-PhanDuyMan-Module-2\\src\\ss16_IO_Text_File\\bt\\Copy_file_text\\target.csv";
        copyFileText.copyFile(source,target);
    }
}
