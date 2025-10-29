class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        int max= dp[0];
        for(int i=1;i<nums.length;i++){
            int take = nums[i];
            int notTake = 0;

            if(i>1){
                take+=dp[i-2];
            }
            notTake = dp[i-1];

            if(take>notTake)
            dp[i]=take;
            else
            dp[i]=notTake;
           if(dp[i]>max){
            max=dp[i];
           }
        }
        return max;
    }
    
}