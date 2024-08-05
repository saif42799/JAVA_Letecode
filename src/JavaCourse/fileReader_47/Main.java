package JavaCourse.fileReader_47;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // fileReader = read content from file as a stem of characters. One by one
        //              read() returns an int value which contains the byte value
        //              when read() returns -1, there in no more data to be read

        try {
            FileReader reader = new FileReader("src/JavaCourse/fileReader_47/art.txt");
            int data = reader.read();
            while (data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
