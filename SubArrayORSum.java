// Given an array of integers A of size N.

// Value of a subarray is defined as BITWISE OR of all elements in it.

// Return the sum of Value of all subarrays of A % 109 + 7.
public class SubArrayORSum {
    public static void main(String[] args) {
        int[] A= {1,2,3,4,5};
        System.out.print(name(A));
    }
    public static int  name(int[] A) {
        int n = A.length;
        long ans=0;
        int[] idx = new int[32];
        for(int i=1;i<=n;i++){
            int temp= A[i-1];
            for(int j=0;j<=31;j++){
                long pow = 1<<j;  //2^j;
                if((temp & pow)!= 0) //bit is set
                {
                    ans+= pow*i;
                    idx[j]=i;
                }
                else if(idx[j] !=0){ //jth bit is not set
                    ans+= idx[j]*pow;
                }
            }
        }
            return (int)ans;
        
    }
}
