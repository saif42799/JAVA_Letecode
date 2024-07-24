package JavaCourse.methodOverriding_35;

public class Main {
    public static void main(String[] args) {

        // method overriding = Declaring a method in sub class,
        //                     which is already present in parent class.
        //                     done so that a child class can give its own implementations

        Animal animal = new Animal();
        animal.speak();

        Dog dog = new Dog();
        dog.speak();


    }
}
