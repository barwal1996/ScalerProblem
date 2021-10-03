/*
A=[3, 7, 90, 20, 10, 50, 40]
B=3
Approach : 
1) Initialize res_index = 0 // Beginning of result index
2) Find sum of first k elements. Let this sum be 'curr_sum'
3) Initialize min_sum = sum
4) Iterate from (k+1)'th to n'th element, do following
   for every element arr[i]
      a) curr_sum = curr_sum + arr[i] - arr[i-k]
      b) If curr_sum < min_sum
           res_index = (i-k+1)
5) Print res_index and res_index+k-1 as beginning and ending
   indexes of resultant subarray.

Example Output
Output 1:
3
Example Explanation
Subarray between indexes 3 and 5
The subarray {20, 10, 50} 

*/
public class SubArrayWithLeastAverage {
    public static void main(String[] args) {
        int[] A= {3, 7, 90, 20, 10, 50, 40};
        int B=3;
        int n =solve(A, B);
        System.out.println(n);
    }
    public static int solve(int[] A, int B) {
        int n=A.length;
        int res_index=0;
        int curr_sum=0;
        if(n<B){
        return -1;
        }
        for(int i=0;i<B;i++){
            curr_sum+=A[i];
        }
        int min_sum=curr_sum;
        for(int i=B;i<n;i++){
            curr_sum=A[i]-A[i-B]; //pehle wale element ko hatane k liye A[i-B] ka sum hataya
            if(curr_sum<min_sum){
                min_sum=curr_sum;
                res_index=i-B+1;
            }
        }
        return res_index;
    }
}
