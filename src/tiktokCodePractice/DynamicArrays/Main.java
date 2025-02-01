package tiktokCodePractice.DynamicArrays;

public class Main {
    public static void main(String[] args) {
        
         // Static Array 
        // ex.
        String[] bob = new String[5];



        
        // Dynamic array 
        // adv.
        // Easy to insert and delete elements

        // Dis.
        // Waste more memory 
        //


        // createing Object 
        DynamicArray dynamicArray = new DynamicArray(5);
        System.out.println("");
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");

        dynamicArray.insert(0, "X");
        dynamicArray.delete("A");
        System.out.println("Search for C: " + dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());

        // Dynamic array ex.
        






    }
    
}
