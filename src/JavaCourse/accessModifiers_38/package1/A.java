package JavaCourse.accessModifiers_38.package1;
import JavaCourse.accessModifiers_38.package2.*;

public class A {
    // protected is accessible to a different class in a different package as long as that class is a sub class
    protected String protectedMessage = "This is protected";

    public static void main(String[] args) {

        // Access Modifiers - public
        //                    protected
        //                    no modifier
        //                    private

        C c = new C();
        System.out.println(c.publicMessage);

        B b = new B();
//        System.out.println(b.);


    }
}
