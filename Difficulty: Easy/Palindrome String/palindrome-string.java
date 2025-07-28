class Solution {
    boolean isPalindrome(String s) {
        // code here
        char[] result=s.toCharArray();
        int i=0,j=result.length-1;
        while(i<=j){
        char temp=result[i];
        result[i]=result[j];
        result[j]=temp;
        i++;
        j--;
        }
        String a=String.valueOf(result);
        
        if(s.equals(a)){
            return true;
        }
        return false;
    }
}