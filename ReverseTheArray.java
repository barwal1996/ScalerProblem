public class ReverseTheArray {
    public static void main(String[] args) {
        int[] A= {1,2,3,2,1};
        System.out.println(solve(A));
        //System.out.println(ans);
    }
    public static int[] solve(final int[] A){
        int n =A.length;
        int[] temp = new int[n];
        int j =0;
        for(int i=n;i>0;i--,j++){
            temp[j]=A[i-1];
        }
    return temp;
    }
}
