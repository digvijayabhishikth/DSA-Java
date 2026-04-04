package Sorting.Sort012;

public class Sort0s1s2s {
    public static void main(String[] args){

        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        //we can use Array.sort() directly or just use any sorting method but it would take O(nlogn) to O(n^2) time. 
        // so to reduce it we are going with this which takes O(n) time

        int c0 = 0;
        int c1 = 0;
        int c2 = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c0++;
            }
            else if(arr[i] == 1){
                c1++;
            }
            else{
                c2++;
            }
        }

        System.out.println(c1+" "+c2+" "+c0);

        System.out.println();

        int index = 0;

        for(int i=0;i<c0;i++){
            arr[index] = 0;
            index++;
        }
        for(int i=0;i<c1;i++){
            arr[index] = 1;
            index++;
        }
        for(int i=0;i<c2;i++){
            arr[index] = 2;
            index++;
        }


        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        
    }
}
