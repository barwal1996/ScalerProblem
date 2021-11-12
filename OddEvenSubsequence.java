public class OddEvenSubsequence{
    public static void main(String[] args) {
        int[] A= {3,34,121,32,41,532,36};
        System.out.println(name(A));
    }
    public static int  name(int[] A) {
        int odd=0,even=0;
        int x=1,y=0;
        int n=A.length;
        for(int i=0;i<n;i++){
            int check = A[i]%2;

            if(check==x){
                odd++;
                x^=1;
            }
            if(check==y){
                even++;
                y^=1;
            }
        }
        return Math.max(odd,even);
    }
}