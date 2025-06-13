// User function Template for Java

class Solution {
    public int minTime(int[] arr, int k) {
        // code here
      
        int low=getMax(arr),high=getSum(arr);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(book(arr,mid)>k){
                
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;    
        
    }
   static int book(int[] arr,int pages){
        int stu=1,pagesStu=0;
        for(int i=0;i<arr.length;i++){
            if(pagesStu+arr[i]<=pages){
                pagesStu+=arr[i];
            }
            else{
                stu++;
                pagesStu=arr[i];
            }
        }
        return stu;
    }
   static int getMax(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
             max = Math.max(max,arr[i]);
            }
        
        return max;
    }
   static int getSum(int[] arr){
        int sum=0;
         for(int i=0;i<arr.length;i++){
             sum+=arr[i];
    }
    return sum;
    }
}
