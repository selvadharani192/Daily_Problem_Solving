class Solution {
    public long countSubarrays(int[] nums, long k) {
        int left = 0;
        long sum = 0;
        long count = 0;

        for (int right = 0; right < nums.length; right++) {
            
            sum += nums[right];
            long prod = sum * (right - left + 1);
            while (left<=right&& (right - left + 1) * sum >= k) {
          
             sum -= nums[left];
               
                left++;
            }
           
                count += right-left+1;
            

        }
        return count;
    }
}