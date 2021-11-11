public class checkSubsequence {
    public static void main(String[] args) {
        String A= "bit";
        String B="fdkjfsnbldfilkktkl";
        System.out.println(solve(A, B));
    }
    public static String solve(String A,String B){
        int n = A.length(); int m = B.length();
        int i =0,j=0;
        while(i<n && j<m){
            if(A.charAt(i)==B.charAt(j)){
                i++;
                j++;
            }
            j++;
        }
        if(i==n){
            return "YES";
        }
        return "NO";
    }
}
