import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        
        int[] arr = {1,3,5,6,8,9};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr){
        boolean swapped;
        //run from 0 to arr length - 1
        for(int i= 0; i < arr.length;i++){
            swapped = false;
            //for every j iteration, the largest number moves to the last index
            for(int j = 1; j< arr.length-i; j++){
                //swap if the element is smaller than previous item
                if(arr[j] < arr[j-1]){
                    //swapping the values
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp; 
                    swapped = true;                   
                }
            }
            //if the array is not sorted for a given value of i, then the array is sorted.
            if(swapped == false){
                break;
            }
        }
    }
}
