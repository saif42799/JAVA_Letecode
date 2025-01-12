package Letecode.EasyProblems.TwoSumProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        
                // RULES: 
        // array of integers = nums
        // integer target
        // return indices of the two numbers such that they add up to target
        // indicies are the index's ex. 0, 1, 2, 3

        int[] nums = {4, -5, 5, 0, 6, 3, 2, 7};
        int target = 1;

        // int num1 = 0;
        // int num2 = 1;
        // int[] findSum1 = {num1, num2};

        // for(int i = 0; i < nums.length; i++){

        //     int findSum = nums[num1] + nums[num2];

        //     if(findSum == target){
        //         findSum1 = new int[] {num1, num2};
        //         break;
        //     }

        //     num1++;
        //     num2++;
        // }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] answer = null;
        // for loop 
         for(int i = 0; i < nums.length; i++){
            int curVal = nums[i];
            // curVal  + x = target 
            int x = target - curVal;

            if(map.containsKey(x)) {
                answer = new int[] {map.get(x), i};
            }
            map.put(curVal, i);

         }

         System.out.println(Arrays.toString(answer));



        // System.out.println(findSum1);
    }




    
}
