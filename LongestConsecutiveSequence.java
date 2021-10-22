// Longest Consecutive Sequence
// Problem Description

// Given an unsorted integer array A of size N.

// Find the length of the longest set of consecutive elements from the array A.



// Problem Constraints
// 1 <= N <= 106

// -106 <= A[i] <= 106



// Input Format
// First argument is an integer array A of size N.



// Output Format
// Return an integer denoting the length of the longest set of consecutive elements from the array A.



// Example Input
// Input 1:

// A = [100, 4, 200, 1, 3, 2]
// Input 2:

// A = [2, 1]


// Example Output
// Output 1:

//  4
// Output 2:

//  2


// Example Explanation
// Explanation 1:

//  The set of consecutive elements will be [1, 2, 3, 4].
// Explanation 2:

//  The set of consecutive elements will be [1, 2].
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] A ={100,4,200,3,1,2};
        int res=name(A);
        System.out.println(res);
    }
    public static int name(final int[] A) {
        int ans=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : A){
            set.add(i);
        }
        for(int num: A){
            int left = num-1;
            int right = num+1;

            while(set.remove(left)) left--;
            while(set.remove(right)) right++;
            ans=Math.max(ans, right-left-1);
            
            if(set.isEmpty()) return ans;
        }
        return ans;
    }
}
