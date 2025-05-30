// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
      int index=0;
       int min=arr.get(0);
       for(int i=1;i<arr.size();i++){
        if(arr.get(i)<min){
            min=arr.get(i);
            index =i;
        }
       }
       return index;
    }
}