// User function Template for Java

class Solution {

    void printDiamond(int n) {
        // Your code here
          for(int i=0;i<n;i++){
              for(int space=0;space<n-i-1;space++){
                  System.out.print(" ");
              }
              for(int j=0;j<=i;j++){
                  System.out.print("* ");
              }
              System.out.println();
          }
          for(int i=0;i<n;i++){
              for(int space=0;space<i;space++){
                  System.out.print(" ");
              }
              for(int j=0;j<n-i;j++){
                  System.out.print("* ");
              }
              System.out.println();
          } 
    }
}
