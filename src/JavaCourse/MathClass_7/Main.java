package JavaCourse.MathClass_7;

public class Main {
    public static void main(String[] args) {
        // Math class
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        double c = Math.min(x, y);
        double v = Math.abs(y);
        double b = Math.sqrt(x);
        double n = Math.round(x);
        // round up
        double m = Math.ceil(x);
        // rounds down
        double a = Math.floor(x);

        System.out.println(z);
    }
}
