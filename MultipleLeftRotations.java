public class MultipleLeftRotations {
    public static void main(String[] args) {
        int[] A= {1,2,3,4,5};
        int[] B={2,3};
        int[][] ans = solve(A, B);
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++){
                System.out.print(ans[i][j]+" ");
            }
        }
    }
    public static int[][] solve(int[] A,int[] B){
        int n =A.length;
        int m = B.length;
        int[][] ans = new int[n][m];

        for(int i=0;i<m;i++){
            int index= B[i]%n;
            for(int j=0;j<n;j++){
                ans[i][j]=A[index];
                index=(index+1)%n;

            }
        }

        return ans;
    }
}
