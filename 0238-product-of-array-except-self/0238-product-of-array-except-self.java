class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCount =0;
        for(int i=0;i<nums.length;i++){
               if(nums[i]==0&&zeroCount==0){
                zeroCount++;   
                continue;
            }
            prod = prod * nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(zeroCount==0){
                nums[i] = prod/nums[i];
            }
            else{
                if(nums[i]==0){
                     nums[i] = prod;
                }
                else{
                     nums[i] = 0;
                }
            }
        }
        return nums;
    }
}