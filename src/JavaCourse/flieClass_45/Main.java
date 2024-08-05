package JavaCourse.flieClass_45;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        // file = An abstract representation of file and directory path names

        File file = new File("src/JavaCourse/flieClass_45/secret_message.txt");

        if (file.exists()){
            System.out.println("That file exist ");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
//            file.delete();  deletes file
        }
        else {
            System.out.println("File doesnt exist");
        }

    }
}
