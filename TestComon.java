import java.util.*;

public class TestComon {
    public static void main(String[] args) {
        int[] A ={2,2,1};
        int [] B= { 2, 10};
       // System.out.print(CommonElements.intersection(A, B));
       int[] res = solve(A,B);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] solve(int[] A, int [] B){
        if(A==null || A.length==0 || B==null || B.length==0){
            return new int[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : A){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        List<Integer> res = new ArrayList<>();

        for(int num : B){
            if(map.containsKey(num) && map.get(num)>0){
                res.add(num);
                int freq= map.get(num);
                freq--;
                map.put(num, freq);
            }
        }
        return ListToArray(res);

    }
    private static int[] ListToArray(List<Integer> List){
        int[] res = new int[List.size()];
        for(int i=0;i<res.length;i++){
            res[i]=List.get(i);
        }
        return res;
    }
}
