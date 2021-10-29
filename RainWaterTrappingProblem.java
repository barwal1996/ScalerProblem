public class RainWaterTrappingProblem {
    public static void main(String[] args) {
        int[] arr= {3,1,2,4,0,1,3,2};
        int[] heights={3,1,2,4,0,1,3,2};
       // int res= rainWater(arr);// 3+5
        int res1=trap(heights);
        System.out.println(res1);
       // System.out.println(res);
    }
    public static int  rainWater(int[] arr) {//O(n) space 
        
        int n = arr.length;
        int[] left= new int[n];
        int[] right = new int[n];

        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]= Math.max(left[i-1], arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1], arr[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(left[i],right[i])-arr[i];   //left and right auxillary array se height of building ko subtract krenege to trap water ajaega
        }
        
        return ans;
    
    }
    public static int trap(int[] heights)  // O(1) space 
    {
        // maintain two pointers left and right, pointing to the leftmost and
        // rightmost index of the input array
        int left = 0, right = heights.length - 1, water = 0;
 
        int maxLeft = heights[left];
        int maxRight = heights[right];
 
        while (left < right)
        {
            if (heights[left] <= heights[right])
            {
                left++;
                maxLeft = Integer.max(maxLeft, heights[left]);
                water += (maxLeft - heights[left]);
            }
            else {
                right--;
                maxRight = Integer.max(maxRight, heights[right]);
                water += (maxRight - heights[right]);
            }
        }
 
        return water;
    }
}
