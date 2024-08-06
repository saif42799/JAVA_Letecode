package JavaCourse.generics_51.boundedTypes;

public class MyGenericsClass <Thing extends Number, Thing2 extends Number> {

    Thing x;
    Thing2 y;

    public MyGenericsClass(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue() {
        return y;
    }
}
