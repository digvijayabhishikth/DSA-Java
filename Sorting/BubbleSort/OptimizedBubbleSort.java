package Sorting.BubbleSort;


// This optimized version helps when the array is already sorted so it doesn't have to perform all iterations.
public class OptimizedBubbleSort {
    public static void main(String args[]){

        int[] array = {20,40,50,3,1,2};

        for(int i=0;i<array.length;i++){
            boolean swapped = false;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
