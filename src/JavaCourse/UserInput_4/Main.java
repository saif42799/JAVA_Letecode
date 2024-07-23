package JavaCourse.UserInput_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // to accept user input you have to use Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Awesome your " + age + " years old");

        // close scanner
        scanner.close();
    }
}
