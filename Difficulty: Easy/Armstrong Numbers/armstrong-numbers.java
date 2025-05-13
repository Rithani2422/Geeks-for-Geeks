//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean flag = ob.armstrongNumber(n);
            if (flag) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int a=0;
        int sum=0;
        int temp=n;
        int length=String.valueOf(n).length();
        while(n!=0){
            int digit=n%10;
            a=(int)Math.pow(digit, length);
            sum+=a;
            n=n/10;
            
            
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }
        
        
        
    }
}