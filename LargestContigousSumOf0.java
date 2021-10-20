// Given an array A of N integers.

// Find the largest continuous sequence in a array which sums to zero.
// Return an array denoting the longest continuous sequence with total sum of zero.

// NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.



// Example Input
// A = [1,2,-2,4,-4]


// Example Output
// [2,-2,4,-4]
import java.util.*;
public class LargestContigousSumOf0 {
    public static void main(String[] args) {
        int[] A={1,2,-2,4,-4};
        int[] res = solve(A);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public  static int[] solve(int[] A) {
    Map<Integer,Integer> mp = new HashMap<>();
    int sum = 0;
    int max = 0;
    int st = 0;
    int end = 0;
    mp.put(0,-1);
    for(int i=0;i<A.length;i++){
        sum+=A[i];
        if(mp.containsKey(sum)){
            int len = i-mp.get(sum);
            //System.out.println(len);
            if(len>max){
                max = len;
                st = mp.get(sum);
                end = i;
            }
        }
        else mp.put(sum,i);
    }
    //System.out.println(mp);
    //System.out.println(max+"p");
    int[] b = new int[max];
    for(int i=st+1;i<=end;i++){
        b[i-st-1] = A[i];
    }
    return b;
}
}

