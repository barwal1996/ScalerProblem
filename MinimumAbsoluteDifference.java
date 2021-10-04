import java.util.Arrays;

//Given an array of integers A, find and return the minimum value of | A [ i ] - A [ j ] |
// where i != j and |x| denotes the absolute value of x.


public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] A= {1, 2, 3, 4, 5        };
        int n=solve(A);
        System.out.println(n);
    }
    public static int solve(int[] A) {
        Arrays.sort(A);
        int minDiff= Integer.MAX_VALUE;
        for(int i=0;i<A.length-1;i++){
            int diff= A[i+1]-A[i];
        
        if(diff<minDiff){
            minDiff=diff;
        }
        if(minDiff==0){
            return 0;
        }
        }
        return minDiff;
    }
}
