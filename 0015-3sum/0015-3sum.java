class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> resultSet = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
            continue; 
        }
           int left = i+1;
           int right = nums.length-1;
           while(left<right){
        
            if(nums[left]+nums[right]+nums[i]==0){
                List<Integer> result = new ArrayList<Integer>();
                result.add(nums[i]);
                result.add(nums[left]);
                result.add(nums[right]);
                resultSet.add(result);
               while(left+1<nums.length&&nums[left+1]==nums[left]){
                left++;
               }
                while(right-1<0&&nums[right-1]==nums[right]){
                right--;
               }
               left++;
               right--;
            }
            else if(nums[left]+nums[right]+nums[i]>0){
                right--;
            }
            else{
                left++;
            }
           }
        }
        return resultSet;
    }
}