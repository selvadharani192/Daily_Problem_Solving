class Solution {
    public int findMin(int[] nums) {
        int left =0;
        int right = nums.length-1;
         int min = Integer.MAX_VALUE;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]>=nums[left]){
                if(min>nums[left])
                min = nums[left];
                left = mid+1;
            }
            else{
                                if(min>nums[mid])
                 min = nums[mid];
                 right = mid-1;
            }
        }
        return min;
    }
}