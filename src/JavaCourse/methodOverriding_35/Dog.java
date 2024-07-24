package JavaCourse.methodOverriding_35;

public class Dog extends Animal{

    // overriding method
    @Override // <- Good practice for overriding methods to let other users know tis is overriding
    void speak(){
        System.out.println("The dog goes bark");
    }

}
