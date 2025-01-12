package tiktokCodePractice.Day1;

import java.util.HashMap;
import java.util.Map;

public class frequency {
    public static void main(String[] args) {
        

        int[] arr = {1,4,5,9,7,7,1,4,4,7,7}; 

        // find the frequency 
        // find how many time sthe element come up

        // use hashmap
        
        HashMap<Integer, Integer> hp = new HashMap<>();

        // put elements in arr in hashmap
        for (int i = 0; i < arr.length; i++) {
            
            if(hp.containsKey(arr[i])){
                hp.put(arr[i], hp.get(arr[i]) + 1);
            }
            else{
                hp.put(arr[i], 1);
            }


        }
         
        for(Map.Entry entry : hp.entrySet()){
            System.out.println("Elemnets | Frequency");
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }
}
