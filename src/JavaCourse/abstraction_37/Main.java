package JavaCourse.abstraction_37;

public class Main {
    public static void main(String[] args) {
        // abstract = abstract classes cannot be instantiated, but they can have a subclass
        //            abstract methods are declared without an implementation

        // basically adds a layer of security to ur classes

        // Vehicle vehicle = new Vehicle();

        Car car = new Car();
        car.go();



    }
}
