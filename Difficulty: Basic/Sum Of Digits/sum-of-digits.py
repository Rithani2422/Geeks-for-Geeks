class Solution:
    def sumOfDigits(self, n):
        # code here
        sum=0
        while n>0:
            temp=n%10
            sum+=temp
            n=n//10
        return sum