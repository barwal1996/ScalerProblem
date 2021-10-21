// A number can be broken into different contiguous sub-subsequence parts. 
// Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245. 
// And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different.
// Possible Sub-sequences: [2, 3, 6, 23, 36, 236] where
// 2 -> 2 
// 3 -> 3
// 6 -> 6
// 23 -> 6  (product of digits)
// 36 -> 18  (product of digits)
// 236 -> 36  (product of digits)
// This number is not a COLORFUL number since the product sequence 23  and sequence 6 is same. 

import java.util.*;
public class ColorfulNumber {
    public static void main(String[] args) {
        int A = 23;
        int res= colorFulNum(A);
        System.out.println(res);
    }
    public static int colorFulNum(int A) {
        HashSet<Integer> hs = new HashSet<>();
        String str = Integer.toString(A);
        for(int i=0;i<str.length();i++){
            int prod=1;
            for(int j=i;j<str.length();j++){
                int num =str.charAt(j)-'0';
                prod*=num;
                if(hs.contains(prod))
                    return 0;
                hs.add(prod);
            }
        }
        
        return 1;
    }
}
