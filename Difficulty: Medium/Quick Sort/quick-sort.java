class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
        
        
    }

    static int partition(int arr[], int low, int high) {
        
        // your code here
        int p=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=p && i<high){
                i++;
            }
            while(arr[j]>p && j>low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int t =arr[low];
        arr[low]=arr[j];
        arr[j]=t;
        return j;
    }
}
