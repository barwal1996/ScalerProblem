import java.util.Arrays;

/*

Return the difference between the maximum among all even numbers of A and the minimum among 
all odd numbers in A.
*/

public class MinimumPick {
    public static void main(String[] args) {
        int[] A={0,2,9,1,11,-1};
        int n=solve(A);
        System.out.println(n);
    }   
    public static int  solve(int[] A) {
        
        Arrays.sort(A);
        int evenMax=0,oddMin=0;
        for(int i=A.length-1;i>=0;i--){
            if(A[i]%2 ==0){
                evenMax=A[i];
                break;
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]%2 !=0){
                oddMin=A[i];
                break;
            }
        }
        int diff= evenMax-oddMin;
        return diff;
    } 
}
