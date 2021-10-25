//Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
//Return a single integer X mod 10003, here X is number of Amazing Substrings in given string.

public class AmazingSubArray {
    public static void main(String[] args) {
        String A="ABEC";
        int n = solve(A);
        int new1=solve1(A);
       // System.out.print(new1);
        System.out.println(n);
    }
    public static int solve(String A) {
        int count =0,res=0; int n=A.length();
        String vowel= "aeiouAEIOU";
        for(int i =0;i<A.length();i++){
            for(int j=0;j<vowel.length();j++){
                if(A.charAt(i)==(vowel.charAt(j))){
                    count+=n-i;
                     
                }
            }
            
        }
        res=count%10003;
        return res;
    }
    public static int solve1(String A) {
    int len=A.length();
        int count=0;

        for (int i = 0; i <len ; i++) {

            char s=A.charAt(i);
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I' || s=='O'||s=='U'){
                count+=len-i;
            }
        }

        return count%10003;
    }
}
