package JavaCourse.generics_51;

public class Main {
    public static void main(String[] args) {

        // generics = enables types (classes and interfaces) to be parameters when defining:
        //            classes, interface and methods
        //            a benefit is to eliminate the need to create multiple versions
        //            of methods or classes fro various data types.
        //            Use 1 version for all reference data types

        // reference data types
        Integer[]  intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArrry = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArrry);
        displayArray(stringArray);

        System.out.println();

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArrry));
        System.out.println(getFirst(stringArray));


    }

    // generic method T or Thing
    public static <Thing> void displayArray(Thing[] array) {

        for (Thing x : array){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array) {

        return array[0];

    }


}
