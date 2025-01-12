package tiktokCodePractice.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class strings {
    public static void main(String[] arg){

        // strings 
        String firstString = "Hello World";
        String secondStrring = "Saif";
        String thirdString = "pizza";
        System.out.println();
        System.out.println(firstString + ", My name is " + secondStrring + " and I like " + thirdString + "!");




        // substring search - 
        String Saif = "I love to go grocery shopping to get food.";
        // indexes     0123456789  

        System.out.println(Saif);
        System.out.println();

        // searching for a substring
        System.out.println(Saif.indexOf("to")); // 7 tihs find the index from left to right 
        System.out.println(Saif.lastIndexOf("to")); // 30 tihs find the index from right to left





        System.out.println();
        // character frequency
        String ex2 = "I love Manogos";
        char ch = 'o';
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < ex2.length(); i++){
            // System.out.println(ex2.charAt(i));
            if (ex2.charAt(i) == ch) {
                count++;
                arr.add(i);
            }

        }
        System.out.println(ch +  " char come up " + count + " times at index " + arr);





        System.out.println();
        // String manipulations
        String bob = "Bobishna";

        System.out.println(bob.length());
        System.out.println(bob.toUpperCase());





        System.out.println();
        // reversing
        String hb = "Happy Birthday";
        // for loop starts from 0 to length now reverse that starting from length to 0 
        for(int i = hb.length() - 1; i >= 0 ; i--){   
            System.out.print(hb.charAt(i));

        }
        




        System.out.println();
        // anagrams - "car" and "rac" a word phrase formed by rearranging the letters of another word or phrase
        // if two word have the same character then its a anagram

        // ex. Given two strinf fid out if it is a anagram

        String str1 = "heart";
        String str2 = "earth";

        // get char first then compare

        // return a char array that contain each character
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // sort array in alphabetical order 
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // compare (.equals compares the two char arrrys)
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }

        System.out.println("");









        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

         // creating return value
         // generic list needs parameter => <> 
         // it wants to know the type of thing that you want to print 
         // In this case you want to print a generic list 
        List<List<String>> groupedAnagrams = new ArrayList<>();

        // hash map 
        // sort word = this list 
        HashMap<String, List<String>> map = new HashMap<>();

        for (String current : strs) {
            // sepate the list to characters 
            char[] character = current.toCharArray(); // makes "eat" in to "e", " a", "t"
            // sorts array 
            Arrays.sort(character); // then sorts it to "a", "e", "t" 
            // put is back in to a string 
            String sorted = new String(character); // then put sback together // "aet"

            // if map(hashmap) contains sorted("aet") which is not yet
            if (map.containsKey(sorted)) {
                // if key=""(sorted) is in hashamp the value="" is added 
                map.get(sorted).add(current);
            }
            // if map(hashmap) doesnt contains sorted("aet") you 
            // create a new list 
            // you add the current("eat") to the list 
            // then you add the key="aet"(sorted) value="eat"(newStr) to the map(hashmap)
            else{
                List<String> newStr = new ArrayList<>();
                newStr.add(current);
                map.put(sorted, newStr);
            }

        }

        // 
        groupedAnagrams.addAll(map.values());
        System.out.println(groupedAnagrams);
        System.out.println("");




        // ** COME BACK TO THIS MAINLY CONFUSED ON THIS LINE = curSum -= arrOfNum[i - (k - 1)]**
        // sliding window 
        int[] arrOfNum = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int start = 0;
        int k = 4;

        int curSum = 0;
        ArrayList<Integer> highSum = new ArrayList<>();

        // loops through entire array 
        for(int i = start; i < arrOfNum.length; i++){

            // add value to curSum 
            curSum = arrOfNum[i] + curSum;

            // is the currSum greater then the max value thet we currently have recorded 
            // i is the index of how far we are in the array
            // k = 4
            // k - 4 = we ar at the 3 index, there ar 4 element in the list
            // 
            if (i >= k - 1) {
                highSum.add(curSum);
                // subtracting first element(1) and adding the next element(23) so 
                // from this = 1, 4, 2, 10 to this 4, 2, 10, 23  
                //  17 -           3 
                //                10
                curSum -= arrOfNum[i - (k - 1)];

            }

        }

        int maxVal = Collections.max(highSum);

        System.out.println(highSum);
        System.out.println(maxVal);
        System.out.println("");










        // two-pointer technique - basically has two points, one in the front 
        // and one in the back
        // It compares each point 
        // two sum ex
        int[] twoSumNum = {4, -5, 5, 0, 6, 3, 2, 7};
        int targetTS = 1;

        // index start from begining
        int lef = 0;
        // index starts from end
        int rig = twoSumNum.length - 1;
        Boolean gate = true;
        int[] anserArr = null;

        while (gate) {
            // 
            int sumTS = twoSumNum[lef] + twoSumNum[rig];

            if (sumTS == targetTS) {
                // return new int[] {};
                anserArr = new int[] {lef, rig};
                System.out.println(Arrays.toString(anserArr));
                gate = false;
            }
            else if(sumTS <= targetTS){
                lef++;
                rig = twoSumNum.length - 1;
            }
            else{
                rig--;
            }

        }
        System.out.println("");
        







        // prefix sums  **DOntr understand fully this is weird stuff**
        int[] preArr = {-2, 0, 3, -5, 2, -1}; 
        
        // make a for loop that starts at index 1
        for (int i = 1; i < preArr.length; i++) {
            // index it at 1 (3)
            //index(1)= this makes the index at 0(6) + index 1(3)
            //     1  =             6 + 3
            preArr[i] = preArr[i - 1] + preArr[i];
        }

        System.out.println(Arrays.toString(preArr));

        int preSum = 0;
        for(int i = 1; i < preArr.length; i++){
            preSum = preSum + preArr[i];
        }
        
        
        System.out.println("Sum of indices between 1 and 5: " + preSum ); 



        





    }
    
}
