class Solution {

    void printTriangle(int n) {
        // code here
        int start=65;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)start);
            }
            System.out.println();
            start++;
        }
    }
}