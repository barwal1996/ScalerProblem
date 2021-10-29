public class SumOfDigitsUsingRecursion {
    public static void main(String[] args) {
        int A=23;
        int res= solve(A);
        System.out.println(res);
    }
    public static int  solve(int A) {
        return sum_of_digits(A);
    }
    public static int sum_of_digits(int n) {
        if(n==0)
            return 0;
        
        return (n%10 + sum_of_digits(n/10));
    }
}
