//Back-end complete function Template for Java

class Solution {

    void printTriangle(int n) {
        int start=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }
}