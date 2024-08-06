package JavaCourse.generics_51.genericClasses;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyGenericsClass<Integer> myInt = new MyGenericsClass<>(1);
        MyGenericsClass<Double> myDouble = new MyGenericsClass<>(3.14);
        MyGenericsClass<Character> myCharacter = new MyGenericsClass<>('@');
        MyGenericsClass<String> myString = new MyGenericsClass<>("Hello");

        ArrayList<String> myFrinds = new ArrayList<>();


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myCharacter.getValue());
        System.out.println(myString.getValue());

    }
}
