public class MaxSumContiguousArray {
    public static void main(String[] args) {
        int[] A={1,2,3,4,-10};
        int n =solve(A);
        System.out.println(n);
    }
    public static int solve(final int[] A) {
        //int n = A.length;
        int csum=0;int overAllsum=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(csum>=0){
            csum+=A[i]; 
            }
            else{
                csum=A[i];
            }
            if(csum>overAllsum){
                overAllsum=csum;
            }
        }
        
        return overAllsum;
    }
}
