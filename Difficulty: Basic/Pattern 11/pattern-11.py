#User function Template for python3

class Solution:
    def printTriangle(self, N):
        # Code here
        start=1
        for i in range(1,N+1):
            if i%2==0:
                start=0
            else:
                start=1
            for j in range(i):
                print(start,end=" ")
                start=1-start
            print()