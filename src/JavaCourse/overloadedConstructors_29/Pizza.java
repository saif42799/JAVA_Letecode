package JavaCourse.overloadedConstructors_29;

public class Pizza {

    // attributes
    String bread;
    String sauce;
    String cheese;
    String toppings;

    // overloaded constructor
    Pizza(String bread, String sauce,String cheese, String toppings){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    Pizza(String bread, String sauce,String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }


}
