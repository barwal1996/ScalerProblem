public class SingleNumber {

    public static void main(String[] args) {
        final int[] A= {1,2,3,2,4,3,5};
        int ans=0;

        for(int i=0;i<A.length;i++){
            ans^=A[i];
        }
        
        System.out.println(ans);
    }
}
