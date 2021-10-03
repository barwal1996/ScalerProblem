/*

You are given T(number of test cases) integer arrays. For each array A, you have to find the 
value of absolute difference between the counts of even and odd elements in the array.


*/
import java.util.*;
public class EvenOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int t= sc.nextInt();
         
         while(t-- > 0){
          int N = sc.nextInt();
            int[] A = new int[N];
            for(int i = 0;i < N; i++){
                A[i] = sc.nextInt();
            }
            
            int cnte = 0;
            int cnto = 0;
            
            for (int i = 0; i < N;i++){
                
                if(A[i] % 2 == 1){
                    cnto++;
                }
                else{
                    cnte++;
                }
            }
            
            System.out.println(Math.abs(cnte - cnto));
         }
    }
}