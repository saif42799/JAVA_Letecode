package JavaCourse.Switches_10;

public class Main {
    public static void main(String[] args) {
        // Switches = is a statement that allows a variable
        //            to be tested for equality against a list of values

        String day = "Monday";

        switch (day){
            case "Sunday":
                System.out.println("It is Sunday!");
                break;
            case "Monday":
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday!");
                break;
            case "Thursday":
                System.out.println("It is Thursday!");
                break;
            case "Friday":
                System.out.println("It is Friday!");
                break;
        }

    }
}
