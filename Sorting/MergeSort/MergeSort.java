package Sorting.MergeSort;

public class MergeSort {
    public static void main(String args[]){

        int[] arr = {10,50,2,8,24,1};

        int l=0, r=arr.length-1;

        MergeSort obj = new MergeSort();
        obj.mergesort(arr, l, r);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void mergesort(int[] arr, int l, int r){
        if(r>l){
            int mid = l+(r-l)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }


    public void merge(int arr[], int l, int mid, int r){

        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }

        for(int i=0;i<n2;i++){
            right[i]=arr[mid+i+1];    
        }

        int i=0,j=0,k=l;

        while(i<n1 && j<n2)
        {
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }

    }
}
