// Multiplication of previous and next
// Given an array of integers A, update every element with multiplication of previous and next 
// elements with following exceptions. a) First element is replaced by multiplication of first
//  and second. b) Last element is replaced by multiplication of last and second last.
public class MultiplicationofPreviousAndNext {
    public static void main(String[] args) {
        int[] A= {1,2,3,4,5};
        int[] res = solve(A);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] solve(int[] A){
        int[] res= new int[A.length];
        if(A.length==1){
            return A;
        } 
        int N=A.length-1;
        for(int i=0;i<=N;i++){
            if(i==0)// first element{
                {
                    res[i]=A[i]*A[i+1];
                }
                else if(i!=N){ 
                    res[i]=A[i-1]*A[i+1];
                }
                else{//last element
                    res[i]=A[i-1]*A[i];
                }
            }
            return res;
        }
    
}
