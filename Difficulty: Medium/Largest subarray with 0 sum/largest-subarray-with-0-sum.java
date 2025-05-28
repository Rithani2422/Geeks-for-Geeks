class Solution {
    int maxLen(int arr[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int maximum=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maximum=i+1;
            }
            else{
                if(map.containsKey(sum)){
                    maximum=Math.max(maximum,i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return maximum;
    }
}