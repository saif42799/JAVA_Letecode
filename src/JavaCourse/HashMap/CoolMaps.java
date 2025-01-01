package JavaCourse.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CoolMaps {
    public static void main(String[] args) {
        
        // map = is an object that lets you store data with "keys" and "values" 
        // map is considered an data structure 

        //   Key     value
        Map<Integer, String> lakers = new HashMap<Integer, String>();

                 // keys         values
        lakers.put(6, "Lebron James");
        lakers.put(0, "Shaquille Harrisn");
        lakers.put(14, "Scotty Pippen Jr.");

        // lakers.remove(0);
        lakers.replace(6, "Saif Shaikh");
        //  

        System.out.println(lakers);
        System.out.println(lakers.containsKey(14));


        for(@SuppressWarnings("rawtypes") Map.Entry m: lakers.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());

        }
        


    }
    
}
