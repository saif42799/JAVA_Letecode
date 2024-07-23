package JavaCourse.SwapTwoVariables_3;

public class Main {
    public static void main(String[] args) {

        // Swapping variables

        String x = "Water";
        String y = "Kool-Aid";
        // store to temp value
        String temp;

        temp = x;
        x = y;
        y = temp;


        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
