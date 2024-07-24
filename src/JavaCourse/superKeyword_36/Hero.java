package JavaCourse.superKeyword_36;

public class Hero extends Person{

    String power;

    public Hero(String name, int age, String power) {
        // calling from the parent class(Person) using super
        super(name, age);
        this.power = power;
    }

    public String toString() {
        return super.toString() + this.power;
    }

}

