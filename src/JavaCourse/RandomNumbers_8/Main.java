package JavaCourse.RandomNumbers_8;
import  java.util.Random;

public class Main {
    public static void main(String[] args) {
        // generating random numbers
        Random random = new Random();
        // limit range or numbers
        int x = random.nextInt(6)+1; // number are random between 1 - 6
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);
    }
}
