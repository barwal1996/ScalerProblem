public class SumOfAllSubarray {
    public static void main(String[] args) {
        int[] A= {1,2,3};
        long n =solve(A);
        System.out.println(n);
    }
    public static long solve(int[] A) {
        long sum=0;
        for(int i=0;i<A.length;i++){
            int s=i+1;
            int e=A.length-i;
            
            sum+=A[i]*s*e;
        }
        return sum;
    }
}
// }
// The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
// Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
