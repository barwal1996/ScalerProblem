import java.util.*;
public class CommonElements {
    public static void main(String[] args) {
        int[] A ={2, 1, 4, 10};
        int [] B= {3, 6, 2, 10, 10};
       // System.out.print(CommonElements.intersection(A, B));
       int[] res = solve(A,B);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] solve(int[] A, int[] B) {
        // public int[] intersect(int[] nums1, int[] nums2) {
        
        if(A == null || B == null || B.length==0  || A.length==0)
            return new int[0];
        // step1: Put elements in nums1 into the map
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:A)
            if(map.containsKey(num))
                map.put(num,map.get(num)+1);
            else
                map.put(num,1);
// step 2: iterate the nums2 and get the result        
        List<Integer> result = new ArrayList<>();
        
            for (int num : B) {
                if (map.containsKey(num) && map.get(num) > 0) 
                {   result.add(num);
                    int freq = map.get(num);
                    freq--;
                    map.put(num, freq);
            }
        }
         
        return listToArray(result);
    }
     
    private static int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
         
        return result;
    }
}