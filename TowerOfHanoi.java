public class TowerOfHanoi {

    public static void main(String[] args) {
        toh("A","B","C",4);
    }

    public static void toh(String src, String dest, String helper, int n){

        
        //base case
        if(n==0){
            return ;
        }
        //step 1 move n-1 disc from src to helper
        toh(src,helper,dest,n-1);

        //step-2 move nth disc from src to dest
        System.out.println("Move the "+n+"th disc from "+src+" to "+dest);

        //step-3 Move n-1 disc from helper to dest
        toh(helper,dest,src,n-1);

    }

}
