// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    
     int inversionCount(int arr[]) {
        return mergeSort(arr,0,arr.length-1);
        
        // Your Code Here
    }
    int mergeSort(int arr[], int l, int r) {
        int count=0;
        // code here
        if(l>=r){
            return 0;
        }
        int mid=(l+r)/2;
        count+=mergeSort(arr,l,mid);
       count+= mergeSort(arr,mid+1,r);
        count+=combine(arr,l,mid,r);
        return count;
        
    }
    int combine(int[] arr,int l,int mid,int high){
        ArrayList<Integer> list=new ArrayList<>();
        int left=l,right=mid+1;
        int count=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                count+=(mid-left+1);
                right++;
            }
        }
            while(left<=mid){
                list.add(arr[left]);
                left++;
            }
            while(right<=high){
                list.add(arr[right]);
                right++;
            }
            for(int i=l;i<=high;i++){
                arr[i]=list.get(i-l);
            }
            return count;
        }
    }
