//import java.lang.*;
import java.util.*;

public class ReverseElementInArrayList {

    public static void main(String[] args) {
       
        Scanner inp = new Scanner(System.in);
        ArrayList < Integer > arr = new ArrayList < Integer > ();
        for (; true;) {
            int a = inp.nextInt();
            inp.nextLine();
            if (a < 0) break;
            arr.add(a);
        }
        inp.close();
        for (int i = arr.size() - 1; i >= 0; i--)
            System.out.print(arr.get(i) + " ");
        System.out.println();

    }
}




