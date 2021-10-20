import java.util.Arrays;
import java.util.HashSet;

public class FindCommonElement {
    public static void main(String[] args) {
        int[] A
        = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };

    // create Array 2
    int[] B = { 100, 9, 64, 7, 36, 5, 16, 3, 4, 1 };

    // print Array 1
    System.out.println("Array 1: "
                       + Arrays.toString(A));
    // print Array 2
    System.out.println("Array 2: "
                       + Arrays.toString(B));
    FindCommonElements(A, B);  
    }
    public static void FindCommonElements(int[] A,int[] B){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i :A){
            set1.add(i);
        }
        for(int j :B){
            set2.add(j);
        }
        set1.retainAll(set2);
        System.out.println("Common ele "+set1);
    }
}
