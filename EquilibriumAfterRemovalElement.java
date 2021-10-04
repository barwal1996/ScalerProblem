//Count ways to make sum of odd and even indexed elements equal by removing an array element

public class EquilibriumAfterRemovalElement {
    public static void main(String[] args) {
        int[] A= {2, 1, 6, 4};
        int n =solve(A);
        System.out.println(n);
    }
    public static int  solve(int[] A) {
        int n = A.length;
        int sumOdd=0,sumEven=0;

        for(int i=0;i<n;i++){
            if(i%2==0){
                sumEven+=A[i];
            }
            else{
                sumOdd+=A[i];
            }
        }
        int currEven=A[0] ;
        int currOdd=0 ;
        int res=0;
        int newEvenSum=0,newOddSum=0;

        for(int i=1;i<n-1;i++){
            if(i%2!=0){
                currOdd+=A[i];
                newEvenSum=currEven+sumOdd-currOdd;

                newOddSum=currOdd+sumEven-currEven-A[i];
            }
            else{
                currEven+=A[i];
                newOddSum=currOdd+sumEven-currEven;
                newEvenSum=currEven+sumOdd-currOdd-A[i];
            }
            if(newEvenSum==newOddSum){
                res++;
            }
        }
        if(sumOdd==sumEven-A[0])//by removing 1st element from array 
        {
            res++;
        }
        if(n%2==1)//odd length
        {
            if(sumOdd==sumEven-A[n-1])//removing the last element
            {
                res++;
            }
        }
        else{
            if(sumEven==sumOdd-A[n-1]){
                res++;
            }
        }

        return res;
    }
}
