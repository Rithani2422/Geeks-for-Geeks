// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        long n=arr.length;
        long SN=(long)(n*(n+1))/2;
        long S2N=(long)(n*(n+1)*(2*n+1))/6;
        long S=0,S2=0;
        for(int i=0;i<n;i++){
            S+=arr[i];
            S2+=(long)arr[i]*arr[i];
        }
        long val1=S-SN;//x-y
        long val2=S2-S2N;
        val2=val2/val1;//x+y
        int x=(int)(val1+val2)/2;
        int y=(int)val2-x;
        list.add(x);
        list.add(y);
        return list;
    }
}