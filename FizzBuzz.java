import java.util.Scanner;

class FizzBuzz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       //String[] res=;
        System.out.println(fizzBuzz(n));
        sc.close();
    }
    public static String[] fizzBuzz(int A){
        String[] ans = new String[A];
        for(int i=1;i<=A;i++){
            if (i%3==0 && i%5==0) {
                ans[i-1]= "FizzBuzz";
            }
            else if(i%3==0){
                ans[i-1]= "Fizz";
            }
            else if(i%5==0){
                ans[i-1]= "Buzz";
            }
            else{
                ans[i-1]= Integer.toString(i);
            }
        }
        return ans;

    }
}