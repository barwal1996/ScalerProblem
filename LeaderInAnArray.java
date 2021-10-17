import java.util.ArrayList;

//An element is leader if it is strictly greater than all the elements to its right side.


public class LeaderInAnArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(16);
        A.add(17);
        A.add(4);
        A.add(3);
        A.add(5);
        A.add(2);
        //(16, 17, 4, 3, 5, 2);
        ArrayList<Integer>  g = solve(A);
        for(int i=0;i<g.size();i++){
            if(g.get(i)==0){
                continue;
            }else{
            System.out.print(g.get(i)+" ");
        }
    }
       // System.out.println(g);

    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A){
        int n =A.size();
        ArrayList<Integer> ans = new ArrayList<>();
        int resMax=Integer.MIN_VALUE;
        for(int i=n;i>=0;i--){
            if(A.get(i)>resMax){
                ans.add(i);
                resMax=A.get(i);
            }
        }
        return ans;
        // int n = A.length;
        // int[] temp = new int[n];

        // int rmax= Integer.MIN_VALUE;
        // for(int i=n-1;i>=0;i--){
        //     if(A[i]>rmax){
        //         temp[i]=A[i];
        //         rmax=A[i];
        //     }
        // }
        // return temp;
    }
}
