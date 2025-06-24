#User function Template for python3

class Solution:
     def reverseString(self, s: str) -> str:
        # code here
        arr=list(s)
        start=0
        end=len(arr)-1
        while(start<end):
            temp=arr[start]
            arr[start]=arr[end]
            arr[end]=temp
            start+=1
            end-=1
        return ''.join(arr)