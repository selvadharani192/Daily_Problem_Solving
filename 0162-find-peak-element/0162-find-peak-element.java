class Solution {
    public int findPeakElement(int[] nums) {
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            int leftSide = mid-1<0?Integer.MIN_VALUE:nums[mid-1];
             int rightSide = mid+1>=nums.length?Integer.MIN_VALUE:nums[mid+1];

            if(nums[mid]>leftSide&&nums[mid]>rightSide){
                return mid;
            }
            else if(nums[mid]>rightSide){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return 0;
    }
}