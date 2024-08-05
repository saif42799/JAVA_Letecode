package JavaCourse.polymorphism_42;

public class Main {
    public static void main(String[] args) {

        // polymorphism = greek word for poly - "many", morph - "form"
        //                The ability of an object to identify as more than one type

        // create an instance of the classes
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        for (Vehicle x : racers) {
            x.go();
        }


    }
}
