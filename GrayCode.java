import java.util.ArrayList;

public class GrayCode {
    
       public static void main(String[] args) {
          int a =3;
          ArrayList < Integer > res = grayCODE(a);
          for(int i=0;i<res.size();i++){
             System.out.println(res.get(i));
          }
       }
           public static ArrayList<Integer> grayCode(int a) {
    
         int n = a;
            ArrayList < Integer > result = new ArrayList < > ();
            result.add(0);
            for (int i = 0; i < n; i++) {
                int curSize = result.size();
                // push back all element in result in reverse order
                for (int j = curSize - 1; j >= 0; j--) {
                    result.add(result.get(j) + (1 << i));
                 //  System.out.println(result.get(i));
                }
            }
            return result;
        }
        public static ArrayList<Integer> grayCODE(int a) {
            int n = a;
            ArrayList<Integer> res = new ArrayList<>();
            res.add(0);
            for(int i=0;i<n;i++){
                int curr = res.size();
                for(int j=curr-1;j>=0;j--){
                    res.add(res.get(j)+ (1<<i));
                }
            }
            return res;
        }

    }
