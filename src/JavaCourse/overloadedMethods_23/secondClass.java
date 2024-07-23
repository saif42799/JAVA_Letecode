package JavaCourse.overloadedMethods_23;

public class secondClass {

    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    static int add(int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d){
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
}
