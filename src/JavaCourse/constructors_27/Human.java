package JavaCourse.constructors_27;

public class Human {

    //attributes
    String name;
    int age;
    double weight;

    // constructor
    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        // in order is access the attributes in this class you have to use "this" keyword
        System.out.println(this.name + " is eating");
    }

    void drink(){
        // in order is access the attributes in this class you have to use "this" keyword
        System.out.println(this.name + " is drinking burp");
    }


}
