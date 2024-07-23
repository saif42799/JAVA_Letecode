package JavaCourse.finalKeyword_25;

public class Main {
    public static void main(String[] args) {
        // final Keyword = anything that is declared as final cannot be changed or updated

        double pi = 3.14159;

        pi = 4;

        System.out.println(pi);

        final double PI2 = 3.14159; // good practice, If something is declared as final capitalize the variable

//        pi2 = 4;  you cant update this

        System.out.println(PI2);


    }
}
