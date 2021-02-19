package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) throws Exception {
        //to write a file
        try (FileWriter fileWriter = new FileWriter("FileWriter.txt")) {

            fileWriter.write("Today is Friday. Chhatrapati Shivaji Maharaj Jayanti. Jai Shivaji.");
            System.out.println("File is written successfully");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        //To read a file
        try (FileReader fileReader = new FileReader("FileWriter.txt")) {
            int i = fileReader.read();
            while (i > 0) {
                System.out.print((char) i);
                i = fileReader.read();
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
