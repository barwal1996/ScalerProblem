import java.util.HashMap;

//Given an array A of integers and another non negative integer k, find if there 
//exists 2 indices i and j such that A[i] - A[j] = k, i != j.


public class DiffK {
  public static void main(String[] args) {
      int[] A= {1,2,3,4,5,1};
      int k =0;
      int res=findDiff(A, k);
      System.out.println(res);
  }  
  public static int findDiff(final int[] A,int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num :A){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        for(int x: map.keySet()){
            if(k>0 && map.containsKey(x+k) || k==0 && map.get(x)>1){
                return 1;
            }

        }
    return 0;
  }
}
