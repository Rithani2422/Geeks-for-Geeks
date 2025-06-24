#User function Template for python3

class Solution:
    def printTriangle(self, N):
        # Code here
        start=65
        for i in range(1,N+1):
            for j in range(i):
                print(chr(start),end="")
            print()
            start+=1
            