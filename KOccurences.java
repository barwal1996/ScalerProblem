//import java.security.interfaces.ECKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class KOccurences {
    public static void main(String[] args) {
        int A=5;
        int B=2;
        int[] C= {1,2,2,3,3};
        int res= name(A, B, C);
        System.out.println(res);
    }
    public static int  name(int A,int B,int[] C) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : C){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        int ans=0; Boolean check =false;
        for(Map.Entry x : map.entrySet()){ //for iteration 
            int y = (int)x.getValue();
            if(y==B){
            check=true;
            ans+= (int)x.getKey();
        }
    }
        if(check==false)
            return 0;

        return ans;
    }
}
