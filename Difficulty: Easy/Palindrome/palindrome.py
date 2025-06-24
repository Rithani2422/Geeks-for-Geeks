#User function Template for python3

class Solution:
    def isPalindrome(self, n):
		# Code here
		original=n
		rev=0
		while n>0:
		    digit=n%10
		    rev=rev*10+digit
		    n=n//10
		if original==rev:
		    return True
		else:
		    return False
		