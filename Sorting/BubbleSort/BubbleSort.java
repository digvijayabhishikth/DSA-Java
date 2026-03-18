package Sorting.BubbleSort;

public class BubbleSort {

    public static void main(String args[]){

        int[] arr = {10, 20, 2 , 30, 1};

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length-1;j++){
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        
        // or we can use this to reduce further iterations
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}