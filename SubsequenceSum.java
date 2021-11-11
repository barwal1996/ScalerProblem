public class SubsequenceSum {
    public static void main(String[] args) {
        int[] A= {1,2,3};
        int B=3;
        System.out.println(name(A, B));
    }

    public static int name(int[] A ,int B) {
        int n = A.length;
        for(int i=n-1;i>=0;i--){
            if(B>=A[i]){
                B=B-A[i];
            }
        }
        if(B!=0)
            return 0;
        else
            return 1;
    }
}
