#User function Template for python3

class Solution:
    def printTriangle(self, N):
        # Code here
        for i in range(1,N+1):
            for j in range(i):
                print(j+1,end=" ")
            for space in range(2*(N-i)):
                print("  ",end="")
            for j in range(i,0,-1):
                print(j,end=" ")
            print()