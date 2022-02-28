package filePractice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File_homework {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir")+"\\src\\filePractice\\read_2.txt");
        try {
           // if(!file.exists())
            file.createNewFile();
            FileWriter fileWriter=new FileWriter(file,true);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.write("First line of code");
            bufferedWriter.newLine();
            bufferedWriter.write("Second line of code");
            bufferedWriter.newLine();
            bufferedWriter.write("Third line of code");
            bufferedWriter.newLine();
            bufferedWriter.write("Fourth line of code");
            bufferedWriter.newLine();
            bufferedWriter.write("Five line of code");
            bufferedWriter.newLine();
            bufferedWriter.write("Six line of code1");
            bufferedWriter.newLine();

            bufferedWriter.close();
            fileWriter.close();

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> readFile = new ArrayList<>();
            String line ;
            while((line=bufferedReader.readLine())!=null){
                readFile.add(line);
                }

            bufferedReader.close();
            fileReader.close();
            for (String str:readFile ) {
                System.out.println(str);
            }

        }catch(IOException ioException){
            System.out.println("Invalid file path");
        }
        Read_1st3Lines readObj = new Read_1st3Lines();
        readObj.read3Lines(file);
        AppendToFile appendObj = new AppendToFile();
        appendObj.appendLines(file);
    }
}
