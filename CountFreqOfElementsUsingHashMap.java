import java.util.HashMap;

public class CountFreqOfElementsUsingHashMap {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        countFreq(arr, n);
    }
    public static void countFreq(int[] A,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i]))
                map.put(A[i],map.get(A[i])+1);
            else
                map.put(A[i], 1);
        }
        for (int i = 0; i < n; i++)
        {

        // To print elements according to first
        // occurrence, traverse array one more time
        // print frequencies of elements and mark
        // frequencies as -1 so that same element
        // is not printed multiple times.
           if (map.get(A[i]) != -1)
           {
                System.out.println(A[i] + " " + map.get(A[i]));
                map.put(A[i], -1);
           }
        }
        //  // Traverse through map and print frequencies
        //  for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
        //      System.out.println(entry.getKey()+ " "+entry.getValue());
        //  } 
         
        //return 1;
    }
}
