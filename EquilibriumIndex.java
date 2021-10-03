/*
Equilibrium index of an array is an index such that the sum of elements at lower indexes is 
equal to the sum of elements at higher indexes.




*/
public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] A={-7, 1, 5, 2, -4, 3, 0};
        int n=solve(A);
        System.out.println(n);
    }
    public static int solve(int[] A){
        int n = A.length;
        int lsum=0,rsum=0;
        //stores the whole array sum 
        for(int i=0;i<n;i++){
            rsum+=A[i];
        }
        //updat rsum
        for(int i=0;i<n;i++){
            rsum=rsum-A[i];

            if(lsum==rsum){
                return i;
            }
            lsum=lsum+A[i];
        }
        return -1;
    } 

}
