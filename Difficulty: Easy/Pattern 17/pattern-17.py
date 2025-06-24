#User function Template for python3

class Solution:
    def printTriangle(self, N):
        # Code here
        for i in range(1,N+1):
            start=65
            for space in range(N-i):
                print(" ",end="")
            for j in range(i):
                print(chr(start+j),end="")
            for k in range(i-1,0,-1):
                print(chr(start+k-1),end="")
            print()