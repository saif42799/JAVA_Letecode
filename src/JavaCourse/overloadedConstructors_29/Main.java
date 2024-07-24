package JavaCourse.overloadedConstructors_29;

public class Main {
    public static void main(String[] args) {
        // overloaded constructors = multiple constructors within a class with the same name,
        //                           but have different parameters
        //                           name + parameters = signature

        Pizza pizza = new Pizza("Thick crust", "Tomato", "Mozzaella", "olives");

        System.out.println("Here are the ingredients of your pizza.");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppings);

        System.out.println();

        Pizza pizza2 = new Pizza("Thick crust", "Tomato", "Mozzaella", "olives");

        System.out.println("Here are the ingredients of your 2nd pizza.");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);

        System.out.println();

        Pizza pizza3 = new Pizza("Thick crust", "Tomato", "Mozzaella", "olives");

        System.out.println("Here are the ingredients of your 3rd pizza.");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);



    }
}
