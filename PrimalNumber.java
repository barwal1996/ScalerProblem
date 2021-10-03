//count number of prime number in an array

public class PrimalNumber {
    public static void main(String[] args) {
        int[] A={-11,7,8,9,10,11};
        int count=solve(A);
        System.out.println(count);
    }
    public static int solve(int[] A) {
        int countP=0;
        int n= A.length;
        for(int i=0;i<n;i++){
            if(A[i]>1){
            boolean check =true;
                for(int j=2;j*j<=A[i];j++){
                        if(A[i]%j==0){
                            check =false;
                        }
                }
                if(check){
                    countP++;
                }
        }
        }

        return countP;
    }
}
