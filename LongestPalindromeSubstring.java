public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String A="abbcccbbbcaaccbababcbcabca";
        String res= solve(A);
        System.out.println(res);
    }
    public static String solve(String A) {
        
        int start=0,end=0;
        for(int i=0;i<A.length();i++){
            int odd = expand(A,i,i);
            int even= expand(A,i,i+1);

            int len = Math.max(odd, even);
            if(len>end-start+1){
                start=i-(len-1)/2; //even length
                end=i+len/2; //odd length

            }
        }
        return A.substring(start, end+1);
    }
    public static int expand(String A,int left,int right) {
        while(left>=0 && right<A.length() && A.charAt(left)==A.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
