class Solution:
    def reverseArray(self, arr):
        # code here
        start=0
        end=len(arr)-1
        while start<end:
                temp=arr[start]
                arr[start]=arr[end]
                arr[end]=temp
                start+=1
                end-=1
        return arr
            
        