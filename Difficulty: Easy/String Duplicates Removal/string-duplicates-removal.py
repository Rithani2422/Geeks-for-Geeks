#User function Template for python3
class Solution:

	
	def removeDuplicates(self, s):
	    # code here
	    arr=[]
	    for i in s:
	        if i not in arr:
	            arr.append(i)
	    return ''.join(arr)