class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
      result[0] =  findFirstPosition(nums,target);
     result[1] =   findLastPosition(nums,target);
      return result;
    }
    int findFirstPosition(int[] nums,int target){
      int left = 0;
      int right = nums.length-1;
      boolean f=false;
      while(left<=right){
        int mid = (left+right)/2;
        if(nums[mid]==target){
            right = mid-1;
            f=true;
        }
        else if(nums[mid]>target){
            right = mid-1;
        }
        else{
            left = mid+1;
        }
      }
      if(f)
      return right+1;
      return -1;
    }
     int findLastPosition(int[] nums,int target){
      int left = 0;
      int right = nums.length-1;
      boolean f=false;
      while(left<=right){
        int mid = (left+right)/2;
        if(nums[mid]==target){
            left = mid+1;
            f=true;
        }
        else if(nums[mid]>target){
            right = mid-1;
        }
        else{
            left = mid+1;
        }
      }
      if(f)
      return left-1;
      return -1;
    }
}