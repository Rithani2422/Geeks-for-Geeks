class Solution {

    void printTriangle(int n) {
        // code here
        for(int i =0;i<n;i++){
            int start=65;
            for(int j=0;j<=i;j++){
                System.out.print((char)start);
                start++;
            }
            System.out.println();
        }
    }
}