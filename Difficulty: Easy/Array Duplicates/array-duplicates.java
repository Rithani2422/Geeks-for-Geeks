class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        // List<Integer> list=new ArrayList<>();
        
        // int i=0;
        //     int j=arr.length-1;
        //         while(i<j){
        //         if(arr[i]!=arr[j]){
                    
        //             j--;
        //         }
        //         else{
        //             list.add(arr[i]);
        //             i++;
        //             j=arr.length-1;
        //         }
                
        //     }
        // return list;
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
         
                if(arr[i]==arr[i-1]){
                     if (list.isEmpty() || list.get(list.size() - 1) != arr[i]) {
                   
                    list.add(arr[i]);
                }
            }
        }
        
        
        return list;
    }
}