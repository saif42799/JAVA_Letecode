package JavaCourse.objectPassing_32;

public class Main {
    public static void main(String[] args) {

        // creating an instance
        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.park(car1);
        garage.park(car2);



    }
}
