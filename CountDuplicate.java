public class CountDuplicate {
    public static void main(String[] args) {
        int[] A={1, 10, 20, 1, 25, 1, 10, 30, 25, 1};
        int res=solve(A);
        System.out.println(res);
    }
    public static int solve(int[] A){
        int count=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    count++;
                    break;
                }    
            }
        }
        return count;
    }
}
