package JavaCourse.toStringMethod_30;

public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    @Override
    public String toString() {
        String myString = "Make: " + make + "\n" + "Model: " + model + "\n" + "color: " + color + "\n" + "year: " + year;
        return myString;
    }
}
