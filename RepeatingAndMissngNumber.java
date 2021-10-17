//TC= O(n) and repeating =3 and missing =4
public class RepeatingAndMissngNumber {
    public static void main(String[] args) {

        int[] A = { 3, 1, 2, 3, 5 };
        int[] ans = repeatedNumber(A);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] repeatedNumber(int[] A) {
        int[] res = new int[2];
        for(int i=0;i<A.length;i++){
            //sorting
            if(A[i]!=i+1 && A[i]!= A[A[i]-1]){
                int temp=A[A[i]-1];
                A[A[i]-1]=A[i];
                A[i]=temp;
                i--;
            }
        }

        for(int i=0;i<A.length;i++){
            //finding repeating and missing number 
            if(A[i]!=i+1){
                res[0]=A[i];
                res[1]=i+1;
            }
        }
        return res;
    }
}
