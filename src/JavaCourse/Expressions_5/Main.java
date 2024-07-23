package JavaCourse.Expressions_5;

public class Main {
    public static void main(String[] args) {

        // expression = operands & operators
        // operands   = values, variables, numbers, quantity
        // operators  = + - * / %

        // "%" module gives the remainder of division

        // ex
        int friends = 10;
        friends = friends + 1;
        friends = friends * 5;
        friends = friends - 1;
        // increment operator
        friends++;
        // decrement operator
        friends--;
        System.out.println(friends);

        // cast = change the data type
        double secondFriends = 10;
        secondFriends = (double) secondFriends / 3 ;
        System.out.println(secondFriends);
    }
}
