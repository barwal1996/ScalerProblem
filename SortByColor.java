
public class SortByColor {
    public static void main(String[] args) {
        int[] A={2,1,0,1,2,0,1,2,2};
        int[] res= sortColors(A);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] sortColors(int[] A) {
        int l=0,i=0; int r=A.length-1;
        while(i<=r){
            if(A[i]==0){
                swap(A,l++,i++);
            }
            else if(A[i]==2){
                swap(A, i, r--);
            }
            else 
                i++;
        }
        return A;
    }
    public static void swap(int[] A, int pt1,int pt2){
        int temp=A[pt1];
        A[pt1]=A[pt2];
        A[pt2]=temp;
    }
}
