package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileHandlingDemo {

    public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("FHDemo.txt");

            String s = "Today is Thursday";
            byte[] arr = s.getBytes();          //converting string into byte array
            fileOutputStream.write(arr);        //writing that array into a file
            System.out.println("File is Written");      //printing that file
        }

        catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }


        try{
            FileInputStream fileInputStream = new FileInputStream("FHDemo.txt");
            int i = fileInputStream.read();

            while(i>0){
                System.out.print((char)i);
                i = fileInputStream.read();
            }
          //  System.out.println(i);
        } catch(IOException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }
    }
}
