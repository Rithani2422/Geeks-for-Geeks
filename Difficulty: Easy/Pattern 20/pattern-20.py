#User function Template for python3

class Solution:
    def printTriangle(self, N):
        # Code here
        for i in range(1,N+1):
            for j in range(i):
                print("*",end="")
            for space in range(2*(N-i)):
                print(" ",end="")
            for k in range(i):
                print("*",end="")
            print()
        
        
        for i in range(1,N):
            for j in range(N-i):
                print("*",end="")
            for space in range(2*i):
                print(" ",end="")
            for k in range(N-i):
                print("*",end="")
            print()