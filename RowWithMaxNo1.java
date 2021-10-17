//Brute Force
//TC= O(row*col);
public class RowWithMaxNo1 {
    public static void main(String[] args) {
        int[][] A={{0, 0, 1},
                   {0, 0, 1},
                   {0, 1, 1}};
        
        int n = solve(A);
        System.out.println(n);   
    }
    public static int solve(int[][] A) {
        int max_row_index=0;
        int max_count1=0;

        for(int i=0;i<A.length;i++){
            int count1=0;
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==1){
                    count1++;
                
                }
            }
            if(count1>max_count1){
                max_count1=count1;
                max_row_index=i;
            }
        }

        return max_row_index;
    }
}
