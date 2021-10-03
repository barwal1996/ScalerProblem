/*
Given an array A and a integer B. A pair(i,j) in the array is a good pair if i!=j and
 (A[i]+A[j]==B). Check if any good pair exist or not.

Return 1 if good pair exist otherwise return 0.


*/
public class GoodPair {
    public static void main(String[] args) {
        int[] A= {1,2,3,4};
        int B=7;
        int n=solve(A, B);
        System.out.println(n);
    }
    public static int solve(int[] A,int B) {
        for(int i =0;i<A.length;i++){
            int sum=0;
            for(int j=i+1;j<A.length;j++){
                if(A[i]+A[j]==B){
                    return 1;
                }
            }
        }
        return 0;
    }


}
