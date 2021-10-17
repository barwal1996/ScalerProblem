import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums={3,30,34,5,9};
       // int n=nums.length;
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        String[] arr= new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]+"";
        }
        Comparator<String> comp = new Comparator<String>()
        {
            @Override
            public int compare(String a, String b)
            {
                return (a+b).compareTo(b+a);
            }
        };
        Arrays.sort(arr,comp);

        StringBuilder sb = new StringBuilder("");
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]+" ");
        }
        if(sb.charAt(0)=='0'){
            return "0";
        }
        
        return sb.toString();
    }
}
