public class StringOperations {
    public static void main(String[] args) {
        String A="AbcaZeoB";
        String res=stringOperations(A);
        System.out.println(res);
    }
    public static String stringOperations(String A) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)>='a' && A.charAt(i)<='z')
            {
                if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u')
                {
                    res.append("#");
                }
                else
                {
                    res.append(A.charAt(i));
                }
            }
        }
        res.append(res);
        return res.toString();
    
    }
}
