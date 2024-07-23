package JavaCourse.overloadedMethods_23;

public class Main {
    public static void main(String[] args) {
        // Overloaded Methods = methods that share the same name but have different parameters
        //                      method name + parameters = method signature

        secondClass secondClass = new secondClass();
        int x1 = secondClass.add(1,2);
        System.out.println(x1);

        int x2 = secondClass.add(1,2, 3);
        System.out.println(x2);

        double x3 = secondClass.add(1.4,2.5, 3.3 ,4.3);
        System.out.println(x3);

    }
}
