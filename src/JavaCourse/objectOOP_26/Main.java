package JavaCourse.objectOOP_26;

public class Main {
    public static void main(String[] args) {
        // object = an instance of a class that may contain attributes and methods
        // ex: (phone, desk , computer, coffee cup)

        // construct instance of class
        // construct car object
        Car myCar = new Car();

        // access attributes
        System.out.println(myCar.make);
        System.out.println(myCar.model);

        myCar.drive();
        myCar.brake();

    }
}
