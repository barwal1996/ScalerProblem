public class VerifyingAnAlienDictionary {
    public static void main(String[] args) {
        String[] words= {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        boolean res = isAlienSorted(words,order);   
        System.out.println(res);     
    }
    public static boolean isAlienSorted(String[] words, String order) {
        int[] chars= new int[26];
        int seq=0;
        for(char c : order.toCharArray()){
            chars[c-'a']=seq++;
        }
        for(int i=0;i<words.length-1;i++){
            String curr = words[i];
            String next = words[i+1];

            int len = Math.min(curr.length(), next.length());

            for(int j=0;j<len;j++){
                if(len!=curr.length() && len==next.length() && curr.startsWith(next)){
                    return false;
                }
                if(chars[curr.charAt(j)-'a']>chars[next.charAt(j)-'a']){
                    return false;
                }
                if(chars[curr.charAt(j)-'a']<(chars[next.charAt(j)-'a'])){
                    break;
                }
            }
        }
        return true;
    }
}
