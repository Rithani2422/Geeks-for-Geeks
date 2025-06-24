#User function Template for python3

class Solution:
    def printTriangle(self, N):
        # Code here
        start=1
        for i in range(1,N+1):
            for j in range(i):
                print(start,end=" ")
                start+=1
            print()