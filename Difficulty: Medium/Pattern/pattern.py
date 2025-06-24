#User function Template for python3

class Solution:
    def printDiamond(self, N):
        # Code here
        for i in range(1,N+1):
            for space in range(N-i):
                print(" ",end="")
            for j in range(i):
                print("*",end=" ")
            print()
            
        for i in range(1,N+1):
            for space in range(i-1):
                print(" ",end="")
            for j in range(N-i+1):
                print("*",end=" ")
            print()