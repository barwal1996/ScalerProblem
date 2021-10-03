/*
Find for how many elements, there is a strictly smaller element and a strictly greater element.

Example Input:
    A = [1, 2, 3]

Example Output:
    1

Explanation:
    only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.

*/
public class SmallerAndGreater {
    public static void main(String[] args) {
        int[] A= {1,2,3,4,5};
        int n=solve(A);
        System.out.println(n);
    }
    public static int solve(int[] A) {
        int minVal=Integer.MAX_VALUE;
        int maxVal=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<A.length;i++){
            minVal=Math.min(minVal, A[i]);

            maxVal=Math.max(maxVal, A[i]);
        }
        for(int i=A.length-1;i>=0;i--){
            if(A[i]>minVal && A[i]<maxVal){
                count++;
            }
        }
        return count;
    }
}
