// Subarray with given sum
// Problem Description

// Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

// If the answer does not exist return an array with a single element "-1".

// First sub-array means the sub-array for which starting index in minimum.



// Problem Constraints
// 1 <= length of the array <= 100000
// 1 <= A[i] <= 109
// 1 <= B <= 109



// Input Format
// The first argument given is the integer array A.

// The second argument given is integer B.



// Output Format
// Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".



// Example Input
// Input 1:

//  A = [1, 2, 3, 4, 5]
//  B = 5
// Input 2:

//  A = [5, 10, 20, 100, 105]
//  B = 110


// Example Output
// Output 1:

//  [2, 3]
// Output 2:

//  -1


// Example Explanation
// Explanation 1:

//  [2, 3] sums up to 5.
// Explanation 2:

//  No subarray sums up to required number.

import java.util.HashMap;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[]  A = {1,2,3,4,5};
        int B=5;
        int[] res= name(A, B);
        for(int i=0;i<res.length;i++){
            if(res[i]!=0){
            System.out.print(res[i]+" ");
        }
    }
    }
    public static int[] name(int[] A,int B) {
        int start=-1,end=-1;
        long csum=0;
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            csum+=A[i];
            if(csum-B==0){
                start=0;
                end=i;
                break;

            }
            if(map.containsKey(csum-B)){
                start=map.get(csum-B)+1;
                end=i;
                break;
            }
            map.put(csum,i);
        }
        if(start==-1){
            return new int[]{-1};
        }
        
        int[] res= new int[A.length];
        for(int i=start;i<=end;i++){
            res[i-start]=A[i];
        }
        return res;
    }
}
