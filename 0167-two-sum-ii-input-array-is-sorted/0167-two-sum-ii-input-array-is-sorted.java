class Solution {
    public int[] twoSum(int[] nums, int target) {
      int left =0;
      int right =nums.length-1;
      int[] result = new int[2];
      int sum=0;
      while(left<right){
        if(nums[left]+nums[right]==target){
            result[0]=left+1;
            result[1]=right+1; 
            return result;
        }
        else if(nums[left]+nums[right]<target){
            left++;
        }
        else{
            right--;
        }
      
      }
  return result;
}
}