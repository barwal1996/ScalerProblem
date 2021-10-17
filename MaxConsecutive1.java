
//only atmost one swap of 0 to 1 is allowed 
//TC= 0(n) and sc=0(1)

public class MaxConsecutive1 {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,1,1,1,0,1};
        System.out.println(name(arr));
    }
    public static int name(int[] arr) {
        int max_cnt=0;
        int start=0,k=1,zerocount=0;
        for(int end=0;end<arr.length;end++){
            if(arr[end]==0){
                zerocount++;
            }

            while(zerocount>k){
                if(arr[start]==0)
                    zerocount--;
            
            start++;
            }
        
        max_cnt=Math.max(max_cnt,end-start+1);
         }
         return max_cnt;
    }
}
