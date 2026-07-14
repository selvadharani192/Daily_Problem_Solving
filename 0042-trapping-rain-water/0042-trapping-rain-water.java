class Solution {
    public int trap(int[] height) {
      int left =0;
      int right = height.length-1;
      int maxLeft = 0;
      int maxRight = 0;
      int res = 0;
      while(left<=right){
        if(height[left]<=maxRight){
        if(height[left]>maxLeft){
            maxLeft = height[left];
        }
         res += maxLeft - height[left];
         left++;
        }
        else{
             if(height[right]>maxRight){
            maxRight = height[right];
        }
         res += maxRight - height[right];
         right--;
        }
      }
      return res;
    }
}