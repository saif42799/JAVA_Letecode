package tiktokCodePractice.BubbleSort;

public class Main {
    public static void main(String[] args) {
        
        // bubble sort = pairs of adjacent elements are compared, anmd the elements 
        //               swapped if they are not in order 

        // small data set - okay-ish 
        // large dtat set - bad 


        // array if int 
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5, 10, 15, 20, 40, };

        bubbleSort(array);

        System.out.println("");

        // enhacned for loop 
        for(int i : array){
            System.out.print(i + ",");
            
        }

    }

    private static void bubbleSort(int array[]) {
    
        //nested for loop
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    //  temp = 9
                    int temp = array[j];
                    //     9 = 1
                    array[j] = array[j+1];
                    //       1 = 9
                    array[j+1] = temp;
                }
            }
            
        }


    }
    
}
