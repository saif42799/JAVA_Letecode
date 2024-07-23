package JavaCourse.methods_22;

public class Main {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon

        helloMethod helloMethod = new helloMethod();
        helloMethod.hello();

        // you have to pass in arguments("Bob", 15) to the methods
        helloMethod.helloName("Bob", 15);

        int x = 3;
        int y = 4;

        System.out.println(helloMethod.addReturnEx(x, y));


    }


}
