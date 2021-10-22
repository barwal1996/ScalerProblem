public class CheckStringPalindrome{
    public static void main(String[] args) {
        String A= "aabbaa";
        int res= solve(A);
        System.out.println(res);
    }
    public static int solve(String A){
        int[] chars = new int[26];
        for(char c : A.toCharArray()){
            chars[c-'a']++;
        }
        int odd=0;
        for(int i =0;i<chars.length;i++){
            if(chars[i]%2!=0)
                odd++;
            if(odd>1)
                return 0;
        }

        return 1;
    }
}