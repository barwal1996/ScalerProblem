// iven an array A of N strings, return all groups of strings that are anagrams.

// Represent a group by a list of integers representing the index(1-based) in the original list. Look at the sample case for clarification.

// NOTE: Anagram : a word, phrase, or name formed by rearranging the letters of another, such as 'spar', formed from 'rasp'.

import java.util.*;

public class GroupofAnagrams {
    public static void main(String[] args) {
        
       ArrayList<String> A = new ArrayList<>();
        A.add("cat");
        A.add("dog");
        A.add("god");
        A.add("tca");
       System.out.println(anagrams(A));
    }
    public static ArrayList<ArrayList<Integer>> anagrams( List<String> A) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<String , ArrayList<Integer>> hashMap = new HashMap<>();
        int i=1;

        for(String str: A){
            char[] array= str.toCharArray();
            Arrays.sort(array);
            String sorted = new String(array);

            if(hashMap.containsKey(sorted)){
                ArrayList<Integer> list = hashMap.get(sorted);
                list.add(i);
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                hashMap.put(sorted, list);
            }
            i++;
        }
        for(Map.Entry<String,ArrayList<Integer>> entrySet : hashMap.entrySet()){
            res.add(entrySet.getValue());
        }
        return res;
        
    }
}
