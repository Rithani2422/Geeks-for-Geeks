// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        d=d%arr.length;
        List<Integer> list=new ArrayList<>();
        for(int i=d;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<d;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
    }
}