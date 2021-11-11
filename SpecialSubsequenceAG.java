public class SpecialSubsequenceAG {
    public static void main(String[] args) {
        String A="AGDSFGAGA";
        System.out.println(name(A));
    }
    public static int name(String A) {
        int ans=0,count_g=0,MOD=1000*1000*1000+7;
       // String searchString="AG";
        for(int i=A.length()-1;i>=0;i--){
            char c =A.charAt(i);
            if(c=='G'){
                count_g+=1;
            }
            if(c=='A'){
                ans+=count_g;
            }
        }
        return ans%MOD;
        
    }
}
