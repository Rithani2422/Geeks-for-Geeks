
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
 
        for(int i=0;i<arr.length;i++){
             int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                
            
            if(sum==target){
                    list.add(i+1);
                    list.add(j+1);
                    return list;
                }
                
        }
        }
    
        list.add(-1);
        return list;
    }
}
