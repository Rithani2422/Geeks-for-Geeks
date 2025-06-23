class Solution {

    void printTriangle(int n) {
        // code here
        
        for(int i=0;i<n;i++){
            int start=65;
                for(int space=0;space<n-i-1;space++){
                    System.out.print(" ");
                }   
                for(int j=0;j<=i;j++){
                    System.out.print((char)(start+j));
                    
                }
                for(int j=i-1;j>=0;j--){
                    System.out.print((char)(start+j));
                }
                System.out.println();
       }
    }
}