//optimised approach
// There are two nested loops in the code and time complexity looks O(mn), but this is not the 
// correct analysis. If we observe closely, we are traversing each row and column at least once 
// i.e outer loop traverses each row and inner loop traverse each column. (Think!)
// Time Complexity = O(m+n)
// Space Complexity: O(1)
public class RowWithMaxNoOf1 {
    public static void main(String[] args) {
     int[][] A={{0, 0, 1},
                {0, 0, 1},
                {0, 1, 1}};
                
    int n = solve(A);
    System.out.println(n);
    }
    public static int solve(int[][] A){
        int max_row_index=0;
        int col=A[0].length;
        //int max_1=0;
        int curr_col=col-1;
        for(int i=0;i<A.length;i++){
            while(curr_col>=0 && A[i][curr_col]==1){
                curr_col--;  //move left for another 1 
                max_row_index=i;
            }//jese hi condition false hui loop break and we will come downward and check if 1 present there
        }
    

        return max_row_index;
    }
}
