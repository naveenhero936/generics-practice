package exception;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo2 {
public static void show(){
    FileReader fileReader =null;

    try {
        fileReader = new FileReader("file.txt");
        int value = fileReader.read();
        new SimpleDateFormat().parse("");
    }
    catch (IOException | ParseException e){
        System.out.println("exception");
    }
    finally{
        if (fileReader!=null) {
            try {
                fileReader.close();
                System.out.println("done1");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //System.out.println("file opened");
}
}
