// Given an integer array nums, move all the even integers at the beginning of the array 
//followed by all the odd integers.

// Return any array that satisfies this condition.

 

// Example 1:

// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] A={3,2,1,4};
        int[] res=sortArrayByParity(A);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] sortArrayByParity(int[] nums){
        int[] arr = new int[nums.length];
        int start=0;int end = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[start++]=nums[i];
            }
            else{
                arr[end--]=nums[i];
            }
        }
        return arr;
    }
}
