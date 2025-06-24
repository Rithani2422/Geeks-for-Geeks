#User function Template for python3

class Solution:
    def printTriangle(self, N):
        # Code here
        
        for i in range(1,N+1):
            start=65
            for j in range(i):
                print(chr(start),end="")
                start+=1
            print()