package JavaCourse.methods_22;

public class helloMethod {

    static void hello() {
        System.out.println("Hello");
    }

    static void helloName(String name, int age) {
        System.out.println("Hello " + name + ". You are " + age);
    }

    // retuning value requires you to specify the data type(int) so dont use void
    static int addReturnEx(int x, int y){
        int z = x + y;
        return z;
    }


}
