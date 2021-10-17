public class PrimalPower {
    public static void main(String[] args) {
        int[] A= {-11,2,4,22,23,9,11};
        int res=primePower(A);
        System.out.println(res);
    }
    public static int primePower(int[] A) {
        int countP=0;

        int n=A.length;
        for(int i=0;i<n;i++){
            if(A[i]>1){
                boolean check =true;
                for(int j=2;j*j<=A[i];j++){
                    if(A[i]%j==0)
                        check=false;
                }
                if(check)
                    countP++;
            }
            
        }
        return countP;
    }
}
