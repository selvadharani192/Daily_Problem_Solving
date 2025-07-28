class Solution {
    public int countMaxOrSubsets(int[] nums) {
                int maxOrValue = 0;
         for (int num : nums) {
            maxOrValue |= num;
        }

       return dp(nums,0,0,maxOrValue);
    }

    public int dp(int[] nums,int orValue,int currentIndex,int max){
        if(currentIndex>=nums.length){
            return (orValue==max)?1:0;
        }
        
       
         return dp(nums,orValue|nums[currentIndex],currentIndex+1,max)+
           dp(nums,orValue,currentIndex+1,max);
           
       
    }
}