
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        
        int sum=0;
        map.put(0,0);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        
        if(map.containsKey(sum-target)){
            list.add(map.get(sum-target)+1);
            list.add(i+1);
            return list;
        }
      
            map.putIfAbsent(sum, i + 1); 
        }
        
        list.add(-1);
        return list;
    }
}
