public class StringPalindromeUsingRecursion {
    public static void main(String[] args) {
        String A= "naman";
        int res= solve(A);
        System.out.println(res);
    }
    public static int solve(String A){

        char[] chars= A.toCharArray();
        int start=0;
        int end=chars.length-1;
        return checkPal(chars,start,end);
    }
    public static int checkPal(char[] chars,int start,int end) {

        if(start>=end)
            return 1;
        
        if(chars[start]!=chars[end])
            return 0;

        return checkPal(chars, start+1, end-1);
    }
}
