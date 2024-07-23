package JavaCourse.printf_24;

public class Main {
    public static void main(String[] args) {
        // printf() = an optional method to control, format and display text to the console window
        //            two arguments = format string + (object/variable/value)
        //            % [flags] [precision] [width] [conversion-character]

        System.out.printf("This is format string %d", 123);
        System.out.println();
        boolean myBoolean = true;
        char myChar = '$';
        String myString = "Bro";
        int myInt = 50;
        double mydouble = 1000;

        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", mydouble);
        System.out.println();

        // width = minimum number of characters to be written as output
        System.out.printf("Hello %10s", myString);
        System.out.println();

        // precision = sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %.2f", mydouble);
        System.out.println();

        // flags = adds an effect to output based on the flag added to format specifiers
        // - = left justify
        // + = right justify
        System.out.printf("You have this much money %-20f", mydouble);
        System.out.println();
        System.out.printf("You have this much money %,f", mydouble);

    }
}
