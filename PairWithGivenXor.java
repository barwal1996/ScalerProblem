// Return a single integer denoting the number of unique pairs of integers in the array A whose XOR is equal to B.



// Example Input
// Input 1:

//  A = [5, 4, 10, 15, 7, 6]
//  B = 5
// Input 2:

//  A = [3, 6, 8, 10, 15, 50]
//  B = 5


// Example Output
// Output 1:

//  1
// Output 2:

//  2


// Example Explanation
// Explanation 1:

//  (10 ^ 15) = 5
// Explanation 2:

//  (3 ^ 6) = 5 and (10 ^ 15) = 5 

import java.util.HashSet;

public class PairWithGivenXor {
    public static void main(String[] args) {
        int[] A= {5, 4, 10, 15, 7, 6};
        int B=5;
        int res=xorPair(A, B);
        System.out.println(res);
    }
    public static int xorPair(int[] A,int B) {
        int cnt=0;
        HashSet<Integer> set1 = new HashSet<>();
        for(int i =0;i<A.length;i++)
        {
            if(!set1.contains(B^A[i])){
                set1.add(A[i]);
            }
            else{
                set1.remove(A[i]);
                cnt++;
            }
        }
        return cnt;

    }
}
