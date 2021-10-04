import java.util.Arrays;

//Given an integer array A, find if an integer p exists in the array such that the number of
// integers greater than p in the array equals to p.
//Return 1 if any such integer p is found else return -1.

//Input : 3, 2, 1, 3
//For integer 2, there are 2 greater elements in the array. So, return 1.

public class NobleInteger {
    public static void main(String[] args) {
        int[] A= {3,2,1,3};
        int n = solve(A);
        System.out.println(n);
    }
    public static int solve(int[] A) {
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            while(i<A.length && A[i]==A[i+1]){
                i++; //if same element exist conitguous we will skip
            }
            if(A[i]== A.length-i-1){
                return 1;
            }
        }
        return -1;
    }

}
