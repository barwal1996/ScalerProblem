public class MaximalString {
    
    private static int maxi = 0;
   // private static final char[] max = null;
    public static void main(String[] args) {
        int B=1;
        String A="254";
        String res=maximalString(A,B);
        System.out.println(res);
    }
    public static void swap(char[] s,int i,int j) {
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
    public static void generate(char[] s,int B) {
        //int max=0;
        if(B==0)
            return ;
        
        for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[j]>s[i]){
                    swap(s,i,j);
                    int temp=Integer.parseInt(String.valueOf(s));
                    maxi=Math.max(maxi,temp);
                    generate(s, B-1);
                    swap(s, j, i);
                }
            }
        }
    }
    public static String maximalString(String A,int B){

        char[] s= A.toCharArray();
        generate(s,B);

        return String.valueOf(maxi);
    }
}
