import java.util.*;
public class ShaggyAndDistance {
    public static void main(String[] args) {
        int[] A= {7, 1, 3, 4, 1, 7};
        int res=solve(A);
        System.out.println(res);
    }
    public static int solve(int[] A) {
        if (A.length == 1) {
            return -1;
        }
        //stores <Value, Index> pair
        HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
        int result = A.length;
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                result = Math.min(result, i - map.get(A[i]));
            }
            map.put(A[i], i);
        }
        return (result == A.length) ? -1 : result;
    }
}
