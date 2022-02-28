package filePractice;

import java.io.*;

public class AppendToFile {
    public void appendLines(File file) {
        try {
            System.out.println("Inside append lines method");
            FileReader fileReader = new FileReader(file);
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write("Append-First Line");
            bufferedWriter.newLine();
            bufferedWriter.write("Append-Second Line");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ioException) {
            System.out.println("Inside append file catch block");
        }
    }
}
