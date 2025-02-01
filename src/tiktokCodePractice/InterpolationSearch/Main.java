package tiktokCodePractice.InterpolationSearch;

public class Main {
    public static void main(String[] args) {
        
        // INTERPOLATION SEARCH = improvment over binary search best used for uniformily disturbuted data
        //                        "guesses" where a value might be based on calcualted probe results
        //                        if probe is incorect, search area is narrowed, and a new probe is calculated 


        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int index = interpolationSearch(array, 256);

        if(index != -1){
            System.out.println("Elemnet found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }


    }

    private static int interpolationSearch(int[] array, int value) {
        // calculate upper bound and the lower bound 
        int high = array.length - 1;
        int low = 0; 

        while (value >= array[low] && value <= array[high] && low <= high) {
            // calculate where value might be 
            //           0  +  ( 8  -  0)  *  (  8  -  1)        /  (    9      -    1)      =  7 
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            
            System.out.println("Probe: " + probe);

            // check to see if probe is equal to our value 
            if(array[probe] == value){
                return probe;
            } 
            // if guess is wrong, narrow down search area 
            else if(array[probe] < value){
                low = probe + 1; 
            }
            else{
                high = probe - 1;
            }


        }

        return -1;

    }
    
}
