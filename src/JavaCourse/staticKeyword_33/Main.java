package JavaCourse.staticKeyword_33;

public class Main {
    public static void main(String[] args) {

        // static keyword = modifier. A single copy of a variable/ method is created and shared.
        //                  The class "own" the static member


        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3= new Friend("Sqwidward");
        Friend friend4= new Friend("Sandy");


        // you don't ne to make Friend Object to access static variable
        System.out.println(Friend.numberOfFriends);
        // or
        Friend.displayFrinds();



    }
}
