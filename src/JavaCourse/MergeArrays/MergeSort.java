package JavaCourse.MergeArrays;

public class MergeSort {
    public static void main(String[] args) {
        
        // divde and conquer algorithim
        
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1}; 

        // invoke a merSort method
        mergeSort(array);

        for(int i = 0; i < array.length; i++){
            System.out.println();
            System.out.println(array[i] + " ");

        }




    }

    private static void mergeSort(int[] array){

        // get length of array
        int length = array.length;

        // base case - when do we stop recursion 
        if(length <= 1){
            return; // base case 
        }

        // find middle position of array 
        int middle = length / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        // coppy element of original array to our right and left array 
        int i = 0; // for left array
        int j = 0; // for right array 

        for(; i < length; i++){
            if(i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }

        // recursion 
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);



    }
    
    // helper method - helps another method 
    private static void merge(int[] leftArray, int[] rightArray, int[] array){

        int leftSize = array.length / 2; 
        int rightSize = array.length - leftSize;
        int i = 0; // indicies         keeping track in array 
        int l = 0; // indicies 
        int r = 0; // indicies 
        
        // check conditions fro merging 
        while (l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]){ 
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) { 
            array[i]  = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }

}
