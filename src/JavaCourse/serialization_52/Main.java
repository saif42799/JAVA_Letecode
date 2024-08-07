package JavaCourse.serialization_52;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        // Serialization = The process of converting an object into a byte stream.
        //                 Persists (saves the state) the object after program exits
        //                 This byte stream can be saved as a file or sent over a network
        //                 Can be sent to a different machine
        //                 Byte stream can be saved as a file (.ser) which is platform independent
        //                 (Think of this as if you're saving a file with the object's information)

        // Deserialization = The reverse process of converting a byte stream into an object.
        //                   (Think of think as if you're loading a saved file)


        //             Steps to Serialize
        //             --------------------------------------------------------------
        //             1. Your object class should implement Serializable interface
        //             2. add import java.io.Serializable;
        //             3. FileOutputStream fileout = new FileOutputStream(file path);
        //             4. ObjectOutputSteam out = new ObjectOutputSteam(fileout);
        //             5. out.writeObject(objectName)
        //             6. out.close(); fileOut.close();


        User user = new User();

        user.name = "Bro";
        user.password = "I<Pizza";


        FileOutputStream fleout = new FileOutputStream("src/JavaCourse/serialization_52/UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fleout);
        out.writeObject(user);
        out.close();
        fleout.close();

        System.out.println("object info saved!");



    }
}
