class Solution {
    public int findPeakElement(int[] nums) {
       int left =0;
       int right = nums.length-1;
       int peak=-1;
       while(left<=right){
         int mid = (left+right)/2;
         if(mid-1>=0&&nums[mid-1]>nums[mid]){
            right = mid-1;
         }
         else{
              peak = mid;
            left = mid+1;
         }
       }
    return peak;
    }
}