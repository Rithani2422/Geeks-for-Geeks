// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first=-1,last=-1;
         ArrayList<Integer> list=new ArrayList<>();
         for(int i=0;i<arr.length;i++){
             if(arr[i]==x){
                 if(first==-1){
                     first=i;
                }
                 last=i;
                
             }
         }
           list.add(first);
           list.add(last);
           return list;
    }
}
