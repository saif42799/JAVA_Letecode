package JavaCourse.MergeArrays;

public class practicMerge {
    public static void main(String[] args) {
        
        int[] array = {3, 7, 8, 5, 4, 2, 6, 1};

        mergeSort(array);

        for(int i = 0; i < array.length; i++){
            System.out.println();
            System.out.println(array[i]  + " ");
        }

    
    }


    private static void mergeSort(int[] array){

        // take array and split it in two two section 
        // left array  = 3, 7, 8, 5
        // right array = 4, 2, 6, 1

        // get length of array 
        int lengthOfArray = array.length;

        // if array is les than 1 then breaks the recursion (base case)
        if(lengthOfArray <= 1){
            return;
        }

        // find middle of array 
        int midlleOfArray = lengthOfArray / 2; // array has a length of 8 (8/2=4)

        // created a new array with the size being midlleOfArray which is 4
        int[] leftArray = new int[midlleOfArray];
        // created a new array with the size being lengthOfArray - midlleOfArray which is 8 - 4 = 4 
        // It like that because not every array will be equally split up  ex. lengthOfArray could be 9 
        int[] rightArray = new int[lengthOfArray - midlleOfArray];

        // splitting original array to left and right array 
        int i = 0; // left array 
        int j = 0; // right array 

        // i is already instiallized ^ so you dont need to putit in the for loop
        for(; i < lengthOfArray; i++){
            // 0 < 4 
            if(i < midlleOfArray){
                // 0 = 3 taking element from array and making it equal left array
                // leftArray had nothing now it has 3 in it 
                leftArray[i] = array[i];
            }
            else{
                // tis gets the other side of array and puts it in rightArray 
                rightArray[j] = array[i];
                // increment j here but i is alreadyt incremnted in the for loop above
                j++;
            }
        }

        // this is were recursion come in
        // alreay made code to split array you are just doing it again(reursion) until there nothing to spilt up
        mergeSort(leftArray);
        mergeSort(rightArray);
        // merge arrays
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int [] rightArray, int[] array){

        // getting the size of the array 
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        // 3 indices 
        int i = 0; // keep track in the original array 
        int left = 0; // lefty array
        int right = 0; // right array 

        // check the conditions fro mergeing 
            // 0 < 2       and 0 < 2
        while (left < leftSize && right < rightSize) {
            // check which element is smaller 
            if (leftArray[left] < rightArray[right]) {
                // adding which ever numbe is smaller to original array
                array[i] = leftArray[left];
                i++;
                left++;
                
            }
            else{
                // if number on the left is not smaller than the number on the right we have to copy the 
                // element from th erigth array to out original array 
                array[i] = rightArray[right];
                i++;
                right++;
            }
        }
        // 1 eleemnt we cant compare because there is 1 left 
        while(left < leftSize){
            array[i] = leftArray[left];
            i++;
            left++;
        }
        while(right < rightSize){
            array[i] = rightArray[right];
            i++;
            right++;
        }


    }
}
