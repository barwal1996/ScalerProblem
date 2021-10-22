// Distinct Numbers in Window
// Problem Description

// You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

// Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

// NOTE: if B > N, return an empty array.



// Input Format
// First argument is an integer array A
// Second argument is an integer B.



// Output Format
// Return an integer array.



// Example Input
// Input 1:

//  A = [1, 2, 1, 3, 4, 3]
//  B = 3
// Input 2:

//  A = [1, 1, 2, 2]
//  B = 1


// Example Output
// Output 1:

//  [2, 3, 3, 2]
// Output 2:

//  [1, 1, 1, 1]


// Example Explanation
// Explanation 1:

//  A=[1, 2, 1, 3, 4, 3] and B = 3
//  All windows of size B are
//  [1, 2, 1]
//  [2, 1, 3]
//  [1, 3, 4]
//  [3, 4, 3]
//  So, we return an array [2, 3, 3, 2].
// Explanation 2:

//  Window size is 1, so the output array is [1, 1, 1, 1].



import java.util.ArrayList;
import java.util.HashMap;

public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        int k=3;
        ArrayList<Integer> A= new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(1);
        A.add(3);
        A.add(4);
        A.add(3);
       // 1, 2, 1, 3, 4, 3];
        ArrayList<Integer> ans= solve(A, k);
        System.out.println(ans);
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A,int k) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<=k-2;i++){
            map.put(A.get(i), map.getOrDefault(A.get(i),0)+1);
        }
        for(int j=0,i=k-1;i<A.size();){
            map.put(A.get(i), map.getOrDefault(A.get(i),0)+1); //Acquire

            list.add(map.size());//add the distinct element of window

            int freq=map.get(A.get(j));

            if(freq==1){ //release the key
                map.remove(A.get(j));
            }
            else{ //check if freq>1
                map.put(A.get(j),freq-1 );
            }
            i++;
            j++;
        }
        return list;
        
    }
}
