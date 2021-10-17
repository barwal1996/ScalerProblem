//import java.lang.*;
import java.util.*;

public class ReverseElementInArrayList {

    public static void main(String[] args) {
       
        Scanner inp = new Scanner(System.in);
        inp.close();
        ArrayList < Integer > arr = new ArrayList < Integer > ();
        for (; true;) {
            int a = inp.nextInt();
            inp.nextLine();
            if (a < 0) break;
            arr.add(a);
        }
        
        for (int i = arr.size() - 1; i >= 0; i--)
            System.out.print(arr.get(i) + " ");
        System.out.println();

        inp.close();

    }
}




