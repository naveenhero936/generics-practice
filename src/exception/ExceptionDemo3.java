package exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo3 {

    public static void show() {

        try (FileReader reader = new FileReader("file.txt");
             FileWriter writer = new FileWriter(".....");
        ) {
            int value = reader.read();
        } catch (IOException e) {
            System.out.println("exception");
        }
    }
}

