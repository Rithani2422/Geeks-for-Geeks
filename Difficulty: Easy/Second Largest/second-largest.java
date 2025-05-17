//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
       int max=0;
       int max1=0;
       if(arr.length<2){
           return -1;
       }
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
               
           }
       }
       for(int j=0;j<arr.length;j++){
           if(arr[j]>max1 && arr[j]!=max){
               max1=arr[j];
           }
       }
       if(max1==0){
           return -1;
       }
        return max1;    
    }
        
    }
