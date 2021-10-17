/*

Xor queries
Problem Description

You are given an array A (containing only 0 and 1) as element of N length.
Given L and R, you need to determine value of XOR of all elements from L to R (both inclusive)
and number of unset bits (0's) in the given range of the array.
Return an 2D array of Q rows and 2 columns i.e the xor value and number of unset bits in 
that range respectively for each query.


 */
public class XorQueries {
    public static void main(String[] args) {
        int[] A= {1,0,0,0,1};
        int[][] B= {{2,4},{1,5},{3,5}};
        int[][] s= solve(A, B);  
        for(int i=0;i<s.length;i++){
            {
                for(int j=0;j<s.length-1;j++)
                {
                    System.out.print(s[i][j]+" ");
                 }
             }
    }
}
    public static int[][] solve(int[] A, int[][] B) {
            int n = A.length;
            int qs= B.length;
            int[] prefXor = new int[n];
            int[] prefSum= new int[n];
            if(A[0]==0){
                prefSum[0]=1;
            }
            
            prefXor[0]=A[0];
            for(int i=1;i<n;i++){
                prefXor[i]=prefXor[i-1]^A[i];
                prefSum[i]= prefSum[i-1];
                if(A[i]==0){
                    prefSum[i]++;
                }
                
            }
            
            int[][] ans = new int[qs][2];
            
            for(int i=0;i<qs;i++){
                int l= B[i][0];
                int r =B[i][1];
                l--;
                r--;
                if(l==0)
                    {
                        ans[i][0]=prefXor[r];
                        ans[i][1]= prefSum[r];
                        
                    }
                else{
                ans[i][0]= prefXor[r]^prefXor[l-1];
                ans[i][1]= prefSum[r]-prefSum[l-1];
    
                    
                }
            }
            return ans;
        }
}
