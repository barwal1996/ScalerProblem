public class ReverseStringWordByWord {
    public static void main(String[] args) {
        String A= "Does Amit have strong feelings for Kom";
        String res=reverse(A);
        System.out.println(res);
    }
    public static String  reverse(String A) {
        String reverseString =" ";
        String[] words=  A.split("\\s");
        for(int i=0;i<words.length;i++){
            if(i==words.length-1){
            reverseString=words[i]+reverseString;
            reverseString=reverseString.trim();
        }
        else{
            reverseString=" "+words[i]+reverseString;
        }
    }
        return reverseString;
    }
}
