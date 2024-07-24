package JavaCourse.staticKeyword_33;

public class Friend {

    // attributes
    String name;
    // static variable
    static int numberOfFriends;

    // constructor
    public Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    // create a static method that returns the amount of friend
    static void displayFrinds(){
        System.out.println("You have " + numberOfFriends + " frinds");
    }
}
