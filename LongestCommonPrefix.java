public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] A= {"flower","flow","flight"};
        String res=solve(A);
        System.out.println(res);
    }
    public static String solve(String[] A) {
        if(A.length==0){
            return "";
        }
        String prefix= A[0];
        for(int i=1;i<A.length;i++){
            while(A[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
