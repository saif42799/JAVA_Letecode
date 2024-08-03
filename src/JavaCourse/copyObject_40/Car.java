package JavaCourse.copyObject_40;

public class Car {

    // attributes
    private String make;
    private String model;
    private int year;

    // constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // overloaded constructor


    public Car(Car x) {
        this.copy(x);
    }

    // getter
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // methods
    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());

    };
}
