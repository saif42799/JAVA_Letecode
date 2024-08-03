package JavaCourse.accessModifiers_38.package2;
import JavaCourse.accessModifiers_38.package1.*;

public class Asub extends A {

    public static void main(String[] args) {

        C c = new C();


        Asub asub = new Asub();
        // protected is accessible to a different class in a different package as long as that class is a sub class
        System.out.println(asub.protectedMessage);

    }

}
