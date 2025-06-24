#User function Template for python3


class Solution:
    def factorial (self, n):
        # code here
        
        num=1
        for i in range(1,n+1):
            num*=i
        return num
            