package JavaCourse.LogicalOperators_11;

public class Main {
    public static void main(String[] args) {
        // Logical operators = used to connect two or more expressions
        //                && = AND
        //                || = Or
        //                !  = Not

        int age = 15;
        String team = "ATL";

        if (age == 18 || age == 21){
            System.out.println("You have been chosen for the team ");
        }
        else if (age == 15 && team == "ATL"){
            System.out.println("You have not been chosen");
        }
        else if (age != 30){
            System.out.println("Go home you dont qualify");
        }
        else {
            System.out.println("GO HOME!");
        }

    }
}
