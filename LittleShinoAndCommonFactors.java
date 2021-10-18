// Little Shino loves maths. Today her teacher gave her two integers. Shino is now wondering how many integers can divide both the numbers. She is busy with her assignments. Help her to solve the problem.

// Input: First line of the input file contains two integers, a and b.

// Output: Print the number of common factors of a and b.

// Constraints:

// SAMPLE INPUT 10 15 SAMPLE OUTPUT 2 Explanation The common factors of and are 1 and 5.

// Time Limit: 1.0 sec(s) for each input file. Memory Limit: 256 MB Source Limit: 1024 KB
import java.util.*;
public class LittleShinoAndCommonFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  a = sc.nextLong();
        long b= sc.nextLong();
        long num=b;
        long num2=a;
        ArrayList<Long> factor = new ArrayList<>();
        if(a>b){
            num=a;
            num2=b;
        }
        int incre= num%2==0?1:2;
        for(long i=1;i*i<=num;i+=incre){
            if(num%i==0){
                factor.add(i);
            }
            if(i!=num/i){
                factor.add(num/i);
            }
        }
        int count=0;
        for(int i=0;i<factor.size();i++){
            if(num2%factor.get(i)==0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
