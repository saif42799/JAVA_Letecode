package JavaCourse.variableScope_28;

import java.util.Random;

public class DiceRoller {

    // global
    Random randomGlobal = new Random();

    // constructor
    DiceRoller(){
        // local
        Random randomlcoal = new Random();
        int number = 0;
        roll(randomlcoal, number);
        roll2(randomlcoal, number);
    }

    // method
    void roll(Random random, int number){
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

    void roll2(Random randomGlobal, int number){
        number = randomGlobal.nextInt(6) + 1;
        System.out.println(number);
    }


}
