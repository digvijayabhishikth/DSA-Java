package Sorting.MergeSortedArrays;

public class MergeSortedArrays {
    
    public static void main(String args[]){

        int[] a = {1,3,5,6,8};
        int[] b = {2,4,7,9,10};
        
        int i=0, j=0, k=0;
        
        int[] c = new int[a.length+b.length];
        
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
        
        for(int x=0;x<c.length;x++){
            System.out.print(c[x]+" ");
        }
    }
}
