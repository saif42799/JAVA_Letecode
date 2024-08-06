package JavaCourse.generics_51.genericClasses;

public class MyGenericsClass <Thing> {

    Thing x;

    public MyGenericsClass(Thing x) {
        this.x = x;
    }

    public Thing getValue() {
        return x;
    }
}
