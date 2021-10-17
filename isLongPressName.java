public class isLongPressName {
    public static void main(String[] args) {
        String name="alex";
        String typed="aaleex";
        boolean res = isLongPressedName(name, typed);
        System.out.println(res);
    }
    public static boolean isLongPressedName(String name, String typed) {
        int m = name.length(); int n = typed.length();
        int i=0,j=0;
        while(i<m && j<n){
            char c1= name.charAt(i);
            char c2= typed.charAt(j);
            
            if(c1!=c2)
                return false;
            //count of consecutive
            int count1=0;
            while(i<m && name.charAt(i)==c1){
                count1++;
                i++;
            }
            int count2=0;
            while(j<n && typed.charAt(j)==c2){
                count2++;
                j++;
            }
            if(count2<count1)
                return false;
        }
        return i==m && j==n;
        
    }
}
