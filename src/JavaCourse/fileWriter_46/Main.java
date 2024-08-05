package JavaCourse.fileWriter_46;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        // fileWriter = write to file

        try {
            FileWriter writer = new FileWriter("src/JavaCourse/fileWriter_46/poem.txt");
            writer.write("Roses are red \nViolets are blue \nBooty boo boo boo \nRockin everywhere");
            writer.append("\n(A poem by bro)");
            writer.close();

        }
        catch (Exception e){
            System.out.println();
        }


    }
}
