import java.util.HashSet;
//Program to check if there exists a subarray with sum 0
//TC = O(N)  SC= O(N)
public class SubArrayWith0Sum {
    public static void main(String[] args) {
        int[] A = {2,2,1,-3,4,3,1,-2,-3};
        int res= solve(A);
        System.out.println(res);
    }
    public static int solve(int[] A) {
        
        HashSet<Long> hs = new HashSet<>();
        long sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            if(A[i]==0 || sum==0 || hs.contains(sum))
                return 1;
            
            hs.add(sum);
        }
        return 0;
    }
}
