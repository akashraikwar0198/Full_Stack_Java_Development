package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndReaderDemo {

    public static void main(String[] args) throws Exception  {
        FileWriter fileWriter = null;
        FileReader fileReader = null;

        //to write a file
        try{
            fileWriter = new FileWriter("FileWriter.txt");
            fileWriter.write("Today is Friday.");
            System.out.println("File is written successfully");
            fileWriter.close();
        } catch (IOException ioException){
            ioException.printStackTrace();
        } finally {
            fileWriter.close();
        }

        //To read a file
        try{
            fileReader = new FileReader("FileWriter.txt");
            int i = fileReader.read();

            while(i>0){
                System.out.print((char)i);
                i = fileReader.read();
            }
        } catch (IOException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        } finally {
            fileReader.close();
        }
    }
}
