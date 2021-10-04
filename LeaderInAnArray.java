//An element is leader if it is strictly greater than all the elements to its right side.


public class LeaderInAnArray {
    public static void main(String[] args) {
        int[] A={16, 17, 4, 3, 5, 2};
        int[] g = solve(A);
        for(int i=0;i<g.length;i++){
            if(g[i]==0){
                continue;
            }else{
            System.out.print(g[i]+" ");
        }
    }
       // System.out.println(g);

    }
    public static int[] solve(int[] A) {
        int n = A.length;
        int[] temp = new int[n];

        int rmax= Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(A[i]>rmax){
                temp[i]=A[i];
                rmax=A[i];
            }
        }
        return temp;
    }
}
