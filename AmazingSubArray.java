//Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
//Return a single integer X mod 10003, here X is number of Amazing Substrings in given string.

public class AmazingSubArray {
    public static void main(String[] args) {
        String A="ABEC";
        int n = solve(A);
        System.out.println(n);
    }
    public static int solve(String A) {
        int n = A.length();
        int res=0,count=0;
        String vowel="aeiouAEIOU";
        for(int i=0;i<A.length();i++){
            for(int j=0;j<vowel.length();i++){
                if(A.charAt(i)==(vowel.charAt(j))){
                    count+=n-i;
                    res=count%10003;
                }
            }
        }
        return res;
    }
}
