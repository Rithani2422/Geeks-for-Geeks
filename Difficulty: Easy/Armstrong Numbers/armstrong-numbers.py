#User function Template for python3

class Solution:
    def armstrongNumber (self, n):
        # code here 
        original=n
        sum=0
        
        while n>0:
            temp=n%10
            sum += pow(temp, 3)
            n=n//10
            
        if original==sum:
            return True
        else:
            return False