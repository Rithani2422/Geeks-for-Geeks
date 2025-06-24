#User function Template for python3
class Solution:
    def sortArr(self, arr): 
        #code here
        self.mergeSort(arr,0,len(arr)-1)
        return arr
    def mergeSort(self,arr,left,right):
        if(left>=right):return
        
        mid=(left+right)//2
        self.mergeSort(arr,left,mid)
        self.mergeSort(arr,mid+1,right)
        self.merge(arr,left,mid,right)
        
    def merge(self,arr,left,mid,right):
        temp=[]
        i=left
        j=mid+1
        while i<=mid and j<=right:
            if arr[i]<arr[j]:
                temp.append(arr[i])
                i+=1
            else:
                temp.append(arr[j])
                j+=1
        while i<=mid:
            temp.append(arr[i])
            i+=1
        while j<=right:
            temp.append(arr[j])
            j+=1
            
        for k in range(len(temp)):
            arr[left+k]=temp[k]
        
        
        
        
        