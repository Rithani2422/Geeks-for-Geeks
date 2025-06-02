// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        // code here.
         int[] index = {-1, -1};
    
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                if(index[0]==-1)
                index[0]=i;
                 index[1]=i;
            }
            
        }
        return index;
    }
}