package JavaCourse.IfStatments_9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // if statements = performs a block of code if it's condition evaluates to be true

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int ageAdult = scanner.nextInt();

        System.out.println("How old is your friend");

        Random random = new Random();
        int age = random.nextInt(10,17);

        System.out.println(age);

        if (ageAdult >= 18 && ageAdult <= 25){
            System.out.println(ageAdult + " You are an adult. You both may pass");
        }else if (ageAdult < 18){
            System.out.println(ageAdult + " Go home you two are to young");
        } else{
            System.out.println(ageAdult + " I dont need to see your ID. You both may pass");
        }
    }
}
