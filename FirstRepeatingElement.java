import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] A = {10, 5, 3, 4, 3, 5, 6};
        //  int res= solve(A);
        //System.out.println(res);
        System.out.println(FirstRepeatingElement.solve(A));
    }
    public static int solve(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        int min=-1;
        for(int i=A.length-1;i>=0;i--){
            if(hs.contains(A[i]))
                min=i;
            else    
                hs.add(A[i]);
        }
        if(min!=-1)
            return A[min];
        
        return -1;
    }
}
