package JavaCourse.superKeyword_36;

public class Main {
    public static void main(String[] args) {

        // super = keyword refers to the superclass (parent) of an object
        //         very similar to the "this" keyword

        Hero hero = new Hero("Batman", 42, "$$$$");

        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.power);

        System.out.println();

        System.out.println(hero.toString());


    }
}
