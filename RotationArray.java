import java.util.*;
public class RotationArray {
    /*Observation: Roatating an array by n and 2*n times give same results. That means rotating i or i%n times is same.
So update B as B%n and then copy element by element in new array where ans[i] = A[(i-B+n)%n]
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        B = B % N;
        int[] ans = new int[N];
        for (int i = 0; i < N; ++i){
            ans[i] = A[(i - B + N) % N];
        }
        for(int i = 0; i < N; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
