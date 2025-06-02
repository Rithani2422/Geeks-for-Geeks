// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        // int sum=0;
        //  if(n==1){
        //         return m;
        //     }
        // for(int i=1;i<m/2;i++){
        //     sum=(int)Math.pow(i,n);
        //     if(m==sum){
        //         return i;
        //     }
           
        // }
        // return -1;
        int sum=0;
        int low=1,high=m;
        while(low<=high){
            int mid=(low+high)/2;
            sum=(int)Math.pow(mid,n);
            if(sum==m){
                return mid;
            }
            else if(sum<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return -1;
    }
}