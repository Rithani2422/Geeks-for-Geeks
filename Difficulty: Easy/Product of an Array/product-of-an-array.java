/*
     arr[] is the array
*/
class Solution {
    public static long product(long arr[]) {
        // your code here
        long mod = 1000000007;
        long product=1;
        for(int i=0;i<arr.length;i++){
          
            product=product*arr[i]%mod;
        }
        return product;
    }
   
}