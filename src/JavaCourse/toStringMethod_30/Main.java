package JavaCourse.toStringMethod_30;

public class Main {
    public static void main(String[] args) {

        // toString() = special method that all objects inherit,
        //              that returns a string that "textually represents" an object
        //              can be used both implicitly and explicitly

        // Create object
        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);

        System.out.println();

        // By default toString will give this -> "JavaCourse.toStringMethod_30.Car@65ab7765"
        // so what we do is to override it and change the message
        System.out.println(car.toString());
        System.out.println();
        // or
        System.out.println(car);



    }
}
