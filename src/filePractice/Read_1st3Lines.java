package filePractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read_1st3Lines {

    public void read3Lines(File file)  {
        try {
            System.out.println("Inside read 3 lines method");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            int counter = 0;
            while (line!=null){
                if(counter<3) {
                    System.out.println(line);
                }
                line= bufferedReader.readLine();
                counter++;
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException ioException){
            System.out.println("Inside read3Lines method catch block");
        }

    }

}
