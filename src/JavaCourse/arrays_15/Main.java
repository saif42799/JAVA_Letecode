package JavaCourse.arrays_15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // array = used to store multiple values in a single variable

        String[] cars = {"Camero", "Corvette", "Tesla", "BMW"};

        cars[0] = "Mustang";

        System.out.println(cars[2]);

        // another way of using an array
        String[] cars2 = new String[3]; // made a limit on ho many cars you can add
        cars2[0] = "Lexus";
        cars2[1] = "Toyota";
        cars2[2] = "Mercedes";

        // iterate through light
        for (int i = 0; i < cars2.length; i++){
            System.out.println(cars2[i]);
        }





        int[] numbers = {3, 2, 4};
     
        int target = 6;

        int num1 = 0;
        int num2 = 1;
        int[] findSum1 = {num1, num2};

        for(int i = 0; i < numbers.length; i++){

            int findSum = numbers[num1] + numbers[num2];

            if(findSum == target){
                findSum1 = new int[] {num1, num2};
                break;
            }

            num1++;
            num2++;

            

        }
        System.out.println(Arrays.toString(findSum1));



    }
}
