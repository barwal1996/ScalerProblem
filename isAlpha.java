public class isAlpha {
    public static void main(String[] args) {
        char[]  A= {'s','c','a','l','e','r'};
        int check = solve(A);
        System.out.println(check);
    }
    public static int solve(char[] A){
        
            for(int i=0;i<A.length;i++){
                char c = A[i];
                if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                    return 0;
            }
            
        }
        return 1;
    }
}
