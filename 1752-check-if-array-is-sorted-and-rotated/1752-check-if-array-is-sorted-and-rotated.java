class Solution {
    public boolean check(int[] nums) {
        int rotatedCount = -1;
        for(int i=0;i<nums.length-1;i++){
           if(nums[i+1]<nums[i]){
            rotatedCount++;
           }
           if(rotatedCount>0){
            return false;
           }
        }
        if(nums[0]<nums[nums.length-1]&&rotatedCount==0)
        return false;
        return true;
    }
}