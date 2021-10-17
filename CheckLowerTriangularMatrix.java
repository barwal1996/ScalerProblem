public class CheckLowerTriangularMatrix {
    public static void main(String[] args) {
        int[][] A = {{1, 0},
                    {0, 1}};
        int res=solve(A);
        System.out.println(res);
    }
    public static int solve(int[][] A) {
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(j>i && A[i][j]!=0)
                    return 0;
            }
        }
        return 1;
    }
}
