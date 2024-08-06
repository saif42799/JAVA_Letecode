package JavaCourse.generics_51.boundedTypes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyGenericsClass<Integer, Integer> myInt = new MyGenericsClass<>(1,9);
        MyGenericsClass<Double, Double> myDouble = new MyGenericsClass<>(3.14,1.01);

//        MyGenericsClass<Character, Character> myCharacter = new MyGenericsClass<>('@','$');
//        MyGenericsClass<String, Character> myString = new MyGenericsClass<>("Hello",'!');

        

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
//        System.out.println(myCharacter.getValue());
//        System.out.println(myString.getValue());

    }
}
