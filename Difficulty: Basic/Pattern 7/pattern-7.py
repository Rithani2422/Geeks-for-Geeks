#User function Template for python3

class Solution:
    def printTriangle(self, N):
        # Code here
        for i in range(1,N+1):
            for space in range(1,N-i+1):
                print(" ",end="")
            for j in range(2*i-1):
                print("*",end="")
            print() 