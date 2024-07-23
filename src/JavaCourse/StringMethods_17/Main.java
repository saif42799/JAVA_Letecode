package JavaCourse.StringMethods_17;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // string = a reference data type that can store one or more characters
        //          reference data types have access to useful methods

        String name = "Bro   ";

        boolean result = name.equals("Bro");
        boolean result2 = name.equalsIgnoreCase("bro");

        int result3 = name.length();

        // gets specified character
        char result4 = name.charAt(2);

        // returns index of specified char, etc.
        int result5 = name.indexOf("r");

        boolean result6 = name.isEmpty();

        String results7 = name.toUpperCase();

        String results8 = name.toLowerCase();

        // trim empty space
        String result9 = name.trim();

        // replaces char
        String result10 = name.replace("0", "a");

        System.out.println(result);
    }
}
