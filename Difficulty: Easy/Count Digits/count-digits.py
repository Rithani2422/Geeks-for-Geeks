#User function Template for python3
def countDigits(n):
    # write a code number of digits of the number
    # return the answer
       
        count=0
        while n>0:
            temp=n%10
            count+=1
            n=n//10
        return count