package JavaCourse.encapsulation_39;

public class Car {

    //attributes
    // private so only this class can access the attributes
    private String make;
    private String model;
    private int year;

    // constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // getters and setters

    // You cant access the attributes in the Main because they are private so you can
    // make "getters" methods to retrieve them
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // to change the private  attributes of an object you an use "setters" methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
