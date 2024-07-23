package JavaCourse.WhileLoops_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // while loop = executes a block of code as long
        //              as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        // do loop performs the block of code
        // at least once before checking the condition
        do {
            System.out.print("Enter your name again: ");
            name = scanner.nextLine();
        }while (name.isBlank());


        System.out.println("Hello " + name);

    }
}
