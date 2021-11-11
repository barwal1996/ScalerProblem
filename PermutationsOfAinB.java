// You have to find the count of all permutations of A present in B as a substring. You can assume
//  a string will have only lowercase letters.
//   TC = 0(M) SC=0(1)
// Permutations of A that are present in B as substring are:
// 1. abc
// 2. cba
// 3. bac
// 4. cab
// 5. abc
// So ans is 5.

public class PermutationsOfAinB {
    public static void main(String[] args) {
       String A = "abc";
        String B = "abcbacabc";
        System.out.println(solve(A,B));
    }
    public static int solve(String A,String B){
        int count =0;
        int n =A.length();
        int m = B.length();

        int hash1[] = new int[26];
        int hash2[] = new int[26];

        //count freq of each char in A string 
        for(int i=0;i<n;i++){
            hash1[A.charAt(i)-'a'] +=1;
        }

        //count freq of each char in first window of size n 
        for(int i=0;i<n;i++){
            hash2[B.charAt(i)-'a'] +=1;
        }
        count+= same(hash1,hash2);
        //move current window  1 step ahead
        for(int i=n,j=0;i<m;i++,j++){
            hash2[B.charAt(j)-'a'] -=1;
            hash2[B.charAt(i)-'a'] +=1;

            count += same(hash1, hash2);
        }
        return count ;
    }
    private static int same(int[] hash1, int[] hash2) {
       for(int i=0;i<26;i++){
        if(hash1[i] != hash2[i]){
            return 0;
        }
       }
       return 1;
    }
}
