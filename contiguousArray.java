//Find the maximum length of a contiguous subarray with equal number of 0 and 1.

import java.util.HashMap;

public class contiguousArray{
    public static void main(String[] args) {
        int[] A= {1,1,0,1,0,1};

        System.out.println(solve(A));
    }
    public static int  solve(int[] A) {
        int sum = 0, maxlen =0;

        HashMap<Integer,Integer> map = new  HashMap<>();
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                A[i]=-1;
            }
            sum+=A[i];

            if(sum==0){
                maxlen= i+1;
            }
            else if(!map.containsKey(sum)){
                map.put(sum, i);
            }
            else{
                maxlen = Math.max(maxlen, i-map.get(sum));
            }
        }
        return maxlen;
    }
}