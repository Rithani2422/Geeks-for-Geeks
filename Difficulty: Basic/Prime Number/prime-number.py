class Solution:
    def isPrime(self, n):
        # code here
        if n<=1:
            return False
        if n==2:
            return True
        if n%2==0:
            return False
        
        for i in range(3,int(n**0.5+1),2):
            if n%i==0:
               return False
        return True
     