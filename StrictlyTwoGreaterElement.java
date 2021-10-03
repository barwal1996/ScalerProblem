import java.util.ArrayList;

/*
You are given an array of distinct integers A, you have to find and return all elements in 
array which have at-least two greater elements than themselves.

*/


public class StrictlyTwoGreaterElement {
    public static void main(String[] args) {
        int[] A= {1,2,3,4,5};
        int[] n=solve(A);
        for(int i=0;i<A.length;i++){
            System.out.println(n[i]);
        }
        //System.out.println(n);
    }
    public static int[] solve(int[] A) {
        int count=0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(A[i]<A[j]){
                    count++;
                }
                if(count==2){
                    temp.add(A[i]);
                    break;
                }
            }
        }
        int[] res = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            res[i]=temp.get(i);
        }
        return res;
    }
}
