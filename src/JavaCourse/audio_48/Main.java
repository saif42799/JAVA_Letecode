package JavaCourse.audio_48;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LineUnavailableException {

        File file = new File("src/JavaCourse/audio_48/Dead Wrong - Jeremy Blake.wav");
        Scanner scanner = new Scanner(System.in);
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")){
                System.out.println("P = play, S = stop, R = reset, Q = quit");
                System.out.print("Enter you choice: ");

                response = scanner.next();
                response = response.toUpperCase();

                switch (response){
                    case ("P"): clip.start();
                    break;
                    case ("S"): clip.stop();
                    break;
                    case ("R"): clip.setMicrosecondPosition(0);
                    break;
                    case ("Q"): clip.close();
                    break;
                    default: System.out.println("Not a valid response");
                }

            }
            System.out.println("Bye");

        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();

    }
}
