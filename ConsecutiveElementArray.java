import java.util.Arrays;

public class ConsecutiveElementArray {
    public static void main(String[] args) {
        int[] A= {3,1,2,4,5};
        int res= solve(A);
        System.out.println(res);
    }
    public static int solve(int[] A) {
        int n= A.length;

        Arrays.sort(A);
        int diff = A[1]-A[0];
        for(int i=2;i<n;i++){
            if(A[i]-A[i-1]!=diff)
                return 0;
        }
        return 1;
    }
}
