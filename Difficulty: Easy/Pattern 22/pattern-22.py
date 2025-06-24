#User function Template for python3

class Solution:
    def printTriangle(self, N):
        # Code here
        size=2*N-1
        for i in range(size):
            for j in range(size):
                maxi=max(abs(N-1-i),abs(N-1-j))+1
                print(maxi,end=" ")
            print()