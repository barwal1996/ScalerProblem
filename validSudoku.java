import java.util.HashSet;
import java.util.List;

public class validSudoku {
    public static void main(String[] args) {
    //    String[] A= ( (3, 0, 6, 5, 0, 8, 4, 0, 0), 
    //    {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
    //    {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
    //    {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
    //    {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
    //    {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
    //    {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
    //    {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
    //    {0, 0, 5, 2, 0, 6, 3, 0, 0} }
       // isValidSudoku(A);
    }
    public int isValidSudoku(final List<String> A){
        HashSet<String> seen = new HashSet<>();
        if(A==null) return 0;
        int n = A.size();
        if(n!=9 || A.get(0).length()!=9) return 0;

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char curr_val = A.get(i).charAt(j);

                if(curr_val != '.'){
                    if(seen.contains(curr_val+"found in row"+ i)|| (seen.contains(curr_val+"found in col "+j)
                      ||  seen.contains(curr_val+"found in sub box "+i/3+"and "+j/3)))
                        return 0;
                    
                        seen.add(curr_val+"found in row"+i);
                        seen.add(curr_val+"found in col "+j);
                        seen.add(curr_val+"found in sub box"+i/3+"and"+j/3);
                }
            }
        }
        return 1;
    } 
}
