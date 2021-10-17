// For A = 4 pattern looks like:  
//                                    1
//                                  2 1
//                                3 2 1
//                              4 3 2 1
//  So we will return it as two-dimensional array. 
//  Row 1 contains 3 spaces and 1 integer so spaces will be considered as 0 in the output.
public class Pattern2D {
    public static void main(String[] args) {
        int A=3;
        int[][] n =solve(A);
        for(int i=0;i<A;i++){
            for(int j=0;j<A;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] solve(int A) {
        int[][] temp = new int[A][A];

        for(int i=0;i<A;i++){
            //print 0
            for(int j=0;j<A-i-1;j++){
                temp[i][j]=0;
            }

            //print pattern numbers
            int col=A-i-1; //last oolumn hai ye 
            for(int j=i+1;j>=1;j--){
                temp[i][col++]=j;
            }
        }
        return temp;
    }

}
