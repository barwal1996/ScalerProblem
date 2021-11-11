// Given an array of integers, find two numbers such that they add up to a specific target number.

// The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based. Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.

// If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.

// Input: [2, 7, 11, 15], target=9
// Output: index1 = 1, index2 = 2

import java.util.HashMap;

public class Twosum {
    public static void main(String[] args) {
        int[]  A = {    7,11,15};
        int B= 9;
        int [] res = twoSum(A, B);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
    public static int[] twoSum(final int[] A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i=0;i<A.length;i++){
            if(map.containsKey(B-A[i])){
                result[i]=i+1;
                result[0]= map.get(B-A[i]);
                return result;
            }
            if(!map.containsKey(A[i]))
                map.put(A[i], i+1);
        }
        return result;
    }
}
